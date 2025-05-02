package com.sysu.simpleFacotry;

public class OperationMul extends Operator {

    @Override
    public Double getResult() {
        return getNum1() * getNum2();
    }
}
