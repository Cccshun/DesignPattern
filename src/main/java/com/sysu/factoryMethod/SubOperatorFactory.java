package com.sysu.factoryMethod;

public class SubOperatorFactory implements OperatorFactory {
    @Override
    public Operator getOperator() {
        return new SubOperator();
    }
}
