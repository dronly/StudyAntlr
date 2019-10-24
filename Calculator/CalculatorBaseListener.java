// Generated from /Users/mayanbo/study/StudyAntlr/Calculator/Calculator.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link CalculatorListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CalculatorBaseListener implements CalculatorListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	int result;
	@Override public void enterProg(CalculatorParser.ProgContext ctx) {
//		Log.info("enterProg");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProg(CalculatorParser.ProgContext ctx) {
//		Log.info("exitProg");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrintExpr(CalculatorParser.PrintExprContext ctx) {
//		Log.info("enterPrintExpr");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrintExpr(CalculatorParser.PrintExprContext ctx) {
//		Log.info("exitPrintExpr");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign(CalculatorParser.AssignContext ctx) {
//		Log.info("enterAssign");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(CalculatorParser.AssignContext ctx) {
//		Log.info("exitAssign");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlank(CalculatorParser.BlankContext ctx) {
//		Log.info("enterBlank");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlank(CalculatorParser.BlankContext ctx) {
//		Log.info("exitBlank");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParens(CalculatorParser.ParensContext ctx) {
//		Log.info("enterParens");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParens(CalculatorParser.ParensContext ctx) {
//		Log.info("exitParens");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMulDiv(CalculatorParser.MulDivContext ctx) {
		Log.info("enterMulDiv");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMulDiv(CalculatorParser.MulDivContext ctx) {
		Log.info("exitMulDiv");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddSub(CalculatorParser.AddSubContext ctx) {
		if (ctx.op.getType() == CalculatorParser.ADD){
			Log.info("enterAdd");
		}else if (ctx.op.getType() == CalculatorParser.SUB) {
			Log.info("enterSub");

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddSub(CalculatorParser.AddSubContext ctx) {
		if (ctx.op.getType() == CalculatorParser.ADD){
			Log.info("exitAdd");
		}else if (ctx.op.getType() == CalculatorParser.SUB) {
			Log.info("exitSub");

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(CalculatorParser.IdContext ctx) {
		Log.info("enterId");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(CalculatorParser.IdContext ctx) {
		Log.info("exitId");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInt(CalculatorParser.IntContext ctx) {
//		Log.info("enterInt");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInt(CalculatorParser.IntContext ctx) {
		Log.info("exitInt:" + ctx.INT().getText());

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) {
//		Log.info("enterEveryRule");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) {
//		Log.info("exitEveryRule");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) {
//		Log.info("visitTerminal");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) {
		Log.info("visitErrorNode");

	}
}