import java.util.HashMap;
import java.util.Map;

public class CalculatorEvalVisitor extends CalculatorBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();

//    @Override public Double visitProg(CalculatorParser.ProgContext ctx) {
//        Log.debug("visitProg");
//        return visitChildren(ctx); }

    @Override
    public Double visitPrintExpr(CalculatorParser.PrintExprContext ctx) {
        Log.debug("visitPrintExpr");
//        String id = ctx.ID().getText();
//        Double value = visit(ctx.expr());
//        this.memory.put(id, value);
        return visit(ctx.expr());
    }

    @Override
    public Double visitAssign(CalculatorParser.AssignContext ctx) {
        Log.debug("visitAssign");
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        this.memory.put(id, value);
        return value;
    }

    @Override
    public Double visitBlank(CalculatorParser.BlankContext ctx) {
        Log.debug("visitBlank");
        return visitChildren(ctx);
    }

    @Override
    public Double visitParens(CalculatorParser.ParensContext ctx) {
        Log.debug("visitParens");
        return visit(ctx.expr());
    }

    @Override
    public Double visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Log.debug("visit" + ctx.getText());
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));

        if (ctx.op.getType() == CalculatorParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx) {
        Log.debug("visit" + ctx.getText());

        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Double visitId(CalculatorParser.IdContext ctx) {
        Log.debug("visitId" + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Double visitInt(CalculatorParser.IntContext ctx) {
        Log.debug("visitInt" + ctx.getText());
        return Double.valueOf(ctx.INT().getText());
    }
}