package com.sysu.simpleFacotry;


public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Operator op1 = OperationFactory.createOperate("/");
        op1.setNum1(10d);
        op1.setNum2(3d);
        System.out.println(op1.getResult());

        Operator op2 = OperationFactory.createOperate("*");
        op2.setNum1(10d);
        op2.setNum2(0d);
        System.out.println(op2.getResult());

        Operator op3 = OperationFactory.createOperate("-");
        op3.setNum1(10d);
        op3.setNum2(0d);
        System.out.println(op3.getResult());
    }
}