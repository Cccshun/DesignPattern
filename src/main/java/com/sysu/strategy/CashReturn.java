package com.sysu.strategy;

import lombok.AllArgsConstructor;

// 满减收费
@AllArgsConstructor
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    @Override
    public double acceptCash(double money) {
        return money - Math.floor(money / moneyCondition) * moneyReturn;
    }
}
