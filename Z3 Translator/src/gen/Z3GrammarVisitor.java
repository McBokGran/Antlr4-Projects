// Generated from Z3Grammar.g4 by ANTLR 4.9.2

package gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Z3GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Z3GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Z3GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Z3GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Z3GrammarParser#definefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinefun(Z3GrammarParser.DefinefunContext ctx);
}