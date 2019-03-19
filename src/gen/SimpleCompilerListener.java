package gen;// Generated from /Users/yemigabriel/JavaProjects/SimpleCompiler/src/SimpleCompiler.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCompilerParser}.
 */
public interface SimpleCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimpleCompilerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimpleCompilerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(SimpleCompilerParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(SimpleCompilerParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SimpleCompilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SimpleCompilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(SimpleCompilerParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(SimpleCompilerParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(SimpleCompilerParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(SimpleCompilerParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(SimpleCompilerParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(SimpleCompilerParser.NumContext ctx);
}