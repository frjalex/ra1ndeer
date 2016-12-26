import java.util.ArrayList;

/**
 * Created by TylerLiu on 2016/12/24.
 */
public class Asm1Compiler extends Asm1BaseVisitor<Integer> {

    private boolean[] reg_use = new boolean[64];
    private ArrayList<String> memAlloc = new ArrayList<>();
    private ArrayList<String> lines;

    public Asm1Compiler(ArrayList<String> lines) {
        this.lines = lines;
    }

    private int allocReg(){
        for (int i = 0; i < 63; i ++){
            if (!reg_use[i]){
                reg_use[i] = true;
                return i+1;
            }
        }
        assert false;
        System.exit(1);
        return -1;
    }

    private void freeReg(int loc){
        assert reg_use[loc - 1];
        reg_use[loc - 1] = false;
    }

    public int getMemSize(){
        return memAlloc.size();
    }

    @Override
    public Integer visitAssign(Asm1Parser.AssignContext ctx) {
        int rs = visit(ctx.expr());
        if (memAlloc.indexOf(ctx.ID().getText()) == -1) {
            memAlloc.add(ctx.ID().getText());
        }
        lines.add("SW 0," + rs+","+memAlloc.indexOf(ctx.ID().getText()) * 4);
        freeReg(rs);
        return -1;
    }

    @Override
    public Integer visitPrint(Asm1Parser.PrintContext ctx) {
        int rs = visit(ctx.expr());
        lines.add("PRINT %d,"+rs);
        lines.add("PRINT \\n");
        freeReg(rs);
        return -1;
    }

    @Override
    public Integer visitPares(Asm1Parser.ParesContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitAddsub(Asm1Parser.AddsubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        freeReg(left);
        freeReg(right);
        int rd = allocReg();
        if ( ctx.op.getType() == Asm1Parser.ADD ) {
            lines.add("ADD "+rd+","+left+","+right);
        }else{// must be SUB
            lines.add("SUB "+rd+","+left+","+right);
        }
        return rd;
    }

    @Override
    public Integer visitId(Asm1Parser.IdContext ctx) {
        int loc = allocReg();
        if (memAlloc.indexOf(ctx.ID().getText()) == -1){
            memAlloc.add(ctx.ID().getText());
        }
        lines.add("LW " + loc+",0,"+memAlloc.indexOf(ctx.ID().getText()) * 4);
        return loc;
    }

    @Override
    public Integer visitInt(Asm1Parser.IntContext ctx) {
        int loc = allocReg();
        lines.add("ADDI " + loc+",0,"+Integer.parseInt(ctx.INT().getText()));
        return loc;
    }

    @Override
    public Integer visitMuldiv(Asm1Parser.MuldivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        int rd = allocReg();
        freeReg(left);
        freeReg(right);
        if ( ctx.op.getType() == Asm1Parser.MUL ) {
            lines.add("MUL "+rd+","+left+","+right);
        }else{// must be DIV
            lines.add("DIV "+rd+","+left+","+right);
        }
        return rd;
    }
}
