package com.sysu.strategy;

// 正常收费
public  class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
