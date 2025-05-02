package com.sysu.strategy;

import lombok.AllArgsConstructor;

// 打折收费
@AllArgsConstructor
public class CashRebate implements CashSuper {
    private double moneyRebate;

    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }
}
