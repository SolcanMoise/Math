package com.learm.Math.basics;

public class Expression {

    private String operation;
    private Integer operand1;
    private Integer operand2;

    String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

}
