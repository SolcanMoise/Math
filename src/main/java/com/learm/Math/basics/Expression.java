package com.learm.Math.basics;

public class Expression {

    private String operation;
    private Integer operand1;
    private Integer operand2;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    /**
     * Calculate the result of expression, if operation is supported
     * @return the result of evaluation
     */
    public String evaluateExpression() {
        ExpressionAdapter adapter= new ExpressionAdapter();
        if(adapter.isSupportedOperation(operation)) {
            try {
                return adapter.solveExpression(operation, operand1, operand2);
            }catch (ArithmeticException e) {
                return "Operation result is missing or is inconclusive";
            }
        }
        return "Operation is currently not supported";
    }

}
