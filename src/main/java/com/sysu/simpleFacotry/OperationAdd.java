package com.sysu.simpleFacotry;

public class OperationAdd extends Operator {

    @Override
    public Double getResult() {
        return getNum1() + getNum2();
    }
}
