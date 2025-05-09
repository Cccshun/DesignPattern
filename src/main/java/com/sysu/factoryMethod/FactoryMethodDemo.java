package com.sysu.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        OperatorFactory factory1 = new AddOperatorFactory();
        Operator opt1 = factory1.getOperator();
        System.out.println(opt1.getResult(10, 5));

        OperatorFactory factory2 = new SubOperatorFactory();
        Operator opt2 = factory2.getOperator();
        System.out.println(opt2.getResult(30, 3));
    }
}
