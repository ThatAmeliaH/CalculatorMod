package com.thatameliah.calculatormod;

import com.ezylang.evalex.Expression;
import com.ezylang.evalex.data.EvaluationValue;

import javax.annotation.Nullable;

public class Calculator {
    public static @Nullable EvaluationValue Evaluate(String expressionString) {
        if (expressionString.isBlank()) { return null; }

        Expression expression = new Expression(expressionString);

        try {
            return expression.evaluate();
        } catch (Exception e) {
            return null;
        }
    }
}
