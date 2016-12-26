import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;

public class Asm1{

    public static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args){
        ANTLRFileStream input = null;
        PrintWriter output = null;
        try {
            input = new ANTLRFileStream(args[0]);
            output = new PrintWriter(args[1]);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        Asm1Lexer lexer = new Asm1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Asm1Parser parser = new Asm1Parser(tokens);
        ParseTree tree = parser.prog(); // begin parsing at init rule
        Asm1Compiler comp = new Asm1Compiler(lines);
        comp.visit(tree);
        output.println(comp.getMemSize() * 4);
        optimize();
        for ( String s: lines ) {
            output.println(s);
        }
        output.println("RETURN");
        output.flush();
        output.close();
    }

    public static void optimize(){
        for (int i = 1; i < lines.size(); i ++){
            String a = lines.get(i-1);
            String b = lines.get(i);
            if (a.startsWith("ADDI") && b.startsWith("ADD") &&
                    a.contains(",0,")){
                if (!b.endsWith(a.substring(a.indexOf(' ')+1, a.indexOf(',')))) continue;
                a = "ADDI" + b.substring(b.indexOf(' '), b.lastIndexOf(',')+1) + a.substring(a.lastIndexOf(',')+1);
                lines.set(i-1, a);
                lines.remove(i);
                i --;
            }

        }
    }
}