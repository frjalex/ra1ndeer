// Generated from /Volumes/Data/LSQ1（数据）/lsq软件/编程/ANTLR4/Asm1/src/Asm1.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Asm1Parser}.
 */
public interface Asm1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Asm1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Asm1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Asm1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Asm1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Asm1Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Asm1Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Asm1Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Asm1Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pares}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPares(Asm1Parser.ParesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pares}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPares(Asm1Parser.ParesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(Asm1Parser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(Asm1Parser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(Asm1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(Asm1Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Asm1Parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Asm1Parser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(Asm1Parser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(Asm1Parser.MuldivContext ctx);
}