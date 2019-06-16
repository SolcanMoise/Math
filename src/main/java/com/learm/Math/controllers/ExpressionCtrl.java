package com.learm.Math.controllers;

import com.learm.Math.basics.Expression;
import com.learm.Math.basics.ExpressionAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping(value = "/math")
public class ExpressionCtrl {

    /**
     * Evaluate math operations
     * @param op the name of operation to be performed
     * @param x the first operand
     * @param y the second operand
     * @return the evaluation of operation
     */
    @RequestMapping(value = "/eval", method = RequestMethod.GET)
    @ResponseBody
    public String evaluateExpression(@RequestParam String op, Integer x, Integer y) {

        Expression mathExpression = new Expression();
        mathExpression.setOperation(op);
        mathExpression.setOperand1(x);
        mathExpression.setOperand2(y);
        ExpressionAdapter adapter = new ExpressionAdapter();
        return adapter.solveExpression(mathExpression);
    }

}
