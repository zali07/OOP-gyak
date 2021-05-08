package lab10_4;

import java.io.IOException;

public interface IExpression {
    public static boolean isOperator( String op){
        return (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
    }

    public static double evaluate( String postfixExpression) throws ExpressionException{
        return 1; // ki kell dolgozni
    }
}
