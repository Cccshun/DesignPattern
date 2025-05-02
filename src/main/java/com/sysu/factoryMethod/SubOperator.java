package com.sysu.factoryMethod;

public class SubOperator implements Operator {
    @Override
    public double getResult(double num1, double num2) {
        return num1 - num2;
    }
}
