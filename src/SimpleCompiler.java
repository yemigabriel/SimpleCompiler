import gen.SimpleCompilerBaseVisitor;
import gen.SimpleCompilerParser;

public class SimpleCompiler extends SimpleCompilerBaseVisitor<Float> {

    @Override
    public Float visitParenthesis(SimpleCompilerParser.ParenthesisContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Float visitAddSub(SimpleCompilerParser.AddSubContext ctx) {
        if (ctx.ADD() != null) {
            return visit(ctx.left) + visit(ctx.right);
        } else {
            return visit(ctx.left) - visit(ctx.right);
        }
    }

    @Override
    public Float visitMulDiv(SimpleCompilerParser.MulDivContext ctx) {
        if (ctx.MUL() != null) {
            return visit(ctx.left) * visit(ctx.right);
        } else {
            return visit(ctx.left) / visit(ctx.right);
        }
    }

    @Override
    public Float visitNum(SimpleCompilerParser.NumContext ctx) {
        String value = ctx.number().getText();
        return Float.valueOf(value);
    }



}
