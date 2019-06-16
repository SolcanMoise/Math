package com.learm.Math.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionAdapterTest {

    ExpressionAdapter adapter = new ExpressionAdapter();

    @Test
    public void solveExpressionHappyCase() {

        Expression victim = new Expression();
        victim.setOperation("add");
        victim.setOperand1(5);
        victim.setOperand2(4);
        assertEquals("9", adapter.solveExpression(victim));

    }

    @Test
    public void solveExpressionWhenOperationIsNotSupported() {

        Expression victim = new Expression();
        victim.setOperation("aad");
        assertEquals("Operation is currently not supported", adapter.solveExpression(victim));

    }

    @Test
    public void solveExpressionWhenOperandsIsMissing() {

        Expression victim = new Expression();
        victim.setOperation("add");
        assertEquals("Operation result is missing or is inconclusive", adapter.solveExpression(victim));

    }

    @Test
    public void solveExpressionWhenAnArithmeticExceptionIsThrown() {

        Expression victim = new Expression();
        victim.setOperation("add");
        assertEquals("Operation result is missing or is inconclusive", adapter.solveExpression(victim));

    }

}