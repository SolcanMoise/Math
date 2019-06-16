package com.learm.Math.basics;

import java.util.ArrayList;

class ExpressionAdapter {


    /**
     * Perform operation and get result
     * @param operation the operation
     * @param x the first operand
     * @param y the second operand
     * @return result of operation
     */
    String solveExpression(String operation, Integer x, Integer y) {

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
    boolean isSupportedOperation(String operation) {

        ArrayList<String> supportedOperations = new ArrayList<>();
        supportedOperations.add("add");
        supportedOperations.add("sub");
        supportedOperations.add("mul");
        supportedOperations.add("div");
        supportedOperations.add("mod");
        return supportedOperations.contains(operation);

    }
}
