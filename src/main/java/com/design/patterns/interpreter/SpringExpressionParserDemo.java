package com.design.patterns.interpreter;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * 解释器模式
 * {@link org.springframework.expression.EvaluationContext}
 * {@link org.springframework.expression.ExpressionParser}
 */
public class SpringExpressionParserDemo {
    public static void main(String[] args){
        Person person=new Person();
        person.setName("Peter");
        //context
        EvaluationContext evaluationContext=new StandardEvaluationContext(person);
        evaluationContext.setVariable("name", "Jack");
        //parser
        ExpressionParser  expressionParser=new SpelExpressionParser();
        expressionParser.parseExpression("name = #name").getValue(evaluationContext);
        System.out.println("Peter's name is : " + person.getName());

    }

    private static class Person{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
