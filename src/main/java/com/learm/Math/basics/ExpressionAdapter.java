package com.learm.Math.basics;

import java.util.ArrayList;

public class ExpressionAdapter {


    /**
     * Perform required operations in order to solve expression
     * @param mathExpression the Expression to be solved
     * @return the evaluation of expression
     */
    public String solveExpression(Expression mathExpression) {

        String operation = mathExpression.getOperation();
        Integer operand1 = mathExpression.getOperand1();
        Integer operand2 = mathExpression.getOperand2();

        if(isSupportedOperation(operation)) {
            try {
                return performOperation(operation, operand1, operand2);
            }catch (ArithmeticException | NullPointerException e) {
                return "Operation result is missing or is inconclusive";
            }
        }
        return "Operation is currently not supported";

    }

    /**
     * Solve expression
     * @param operation the operation
     * @param x the first operand
     * @param y the second operand
     * @return result
     */
    private String performOperation(String operation, Integer x, Integer y) {
        int result = 0;

        switch(operation) {
            case "add" : result = x + y; break;
            case "sub" : result = x - y; break;
            case "mul": result = x * y; break;
            case "div": result = x / y; break;
            default: result = x % y;
        }

        return Integer.toString(result);
    }


    /**
     * Check if the operation is supported
     * @param operation - the math operation to check
     * @return true if the operation is supported, false otherwise
     */
    private boolean isSupportedOperation(String operation) {

        ArrayList<String> supportedOperations = new ArrayList<>();
        supportedOperations.add("add");
        supportedOperations.add("sub");
        supportedOperations.add("mul");
        supportedOperations.add("div");
        supportedOperations.add("mod");
        return supportedOperations.contains(operation);

    }
}
