package com.sysu.simpleFacotry;

public class OperationSub extends Operator {

    @Override
    public Double getResult() {
        return getNum1() - getNum2();
    }
}
