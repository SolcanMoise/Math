package com.learm.Math.controllers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class ExpressionCtrlTest {

    @Autowired
    private ExpressionCtrl victim = new ExpressionCtrl();

    @Test
    public void evaluateExpression() {

        assertEquals("12", victim.evaluateExpression("add", 10, 2));
        assertEquals("12", victim.evaluateExpression("sub", 20, 8));
        assertEquals("12", victim.evaluateExpression("mul", 4, 3));
        assertEquals("12", victim.evaluateExpression("div", 36, 3));
        assertEquals("12", victim.evaluateExpression("mod", 12, 14));

    }
}