package com.sysu.strategy;


public class StrategyDemo {
    public static void main(String[] args) {
        CashContext cashContext1 = new CashContext("正常收费");
        System.out.println(cashContext1.getResult(1000));

        CashContext cashContext2 = new CashContext("打8折");
        System.out.println(cashContext2.getResult(1000));

        CashContext cashContext3 = new CashContext("满300减30");
        System.out.println(cashContext3.getResult(1000));
    }
}

