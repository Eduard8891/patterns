package composite;

import com.sun.jdi.FloatValue;

import java.util.ArrayList;
import java.util.List;

// Выражение - контейнер
public class Expression implements SubExpression {

    private List<SubExpression> exprs;

    public Expression(SubExpression... exprs) {
        this.exprs = new ArrayList<SubExpression>();
        for (SubExpression expr : exprs) {
            this.exprs.add(expr);
        }
    }

    @Override
    public void add(SubExpression expr) {
        exprs.add(expr);
    }

    @Override
    public void sub(SubExpression expr) {
        if (expr instanceof IntegerValue) {
            exprs.add(new IntegerValue(-1 * expr.value().intValue()));
        }
    }

    @Override
    public SubExpression getSubExpression(int index) {
        return exprs.get(index);
    }

    @Override
    public Number value() {
        Number result = 0f;

        for (SubExpression expr : exprs) {
            result = result.floatValue() + expr.value().floatValue();
        }

        return result;
    }
}