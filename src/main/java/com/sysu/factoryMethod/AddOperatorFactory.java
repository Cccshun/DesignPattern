package com.sysu.factoryMethod;

public class AddOperatorFactory implements OperatorFactory {
    @Override
    public Operator getOperator() {
        return new AddOperator();
    }
}
