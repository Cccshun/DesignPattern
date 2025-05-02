package com.sysu.simpleFacotry;

public class OperationDiv extends Operator {

    @Override
    public Double getResult() {
        if (getNum2() == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return getNum1() / getNum2();
    }
}
