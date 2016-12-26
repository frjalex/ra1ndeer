// Generated from /Volumes/Data/LSQ1（数据）/lsq软件/编程/ANTLR4/Asm1/src/Asm1.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Asm1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Asm1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Asm1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Asm1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Asm1Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link Asm1Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Asm1Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pares}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPares(Asm1Parser.ParesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(Asm1Parser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Asm1Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Asm1Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link Asm1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(Asm1Parser.MuldivContext ctx);
}