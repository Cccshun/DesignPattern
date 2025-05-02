package com.sysu.strategy;

public class CashContext {
    private CashSuper cashAcceptObj;

    public CashContext(String type) {
        switch (type) {
            case PreferentialStrategyConstant.NORMAL:
                cashAcceptObj = new CashNormal();
                break;
            case PreferentialStrategyConstant.REBATE80:
                cashAcceptObj = new CashRebate(0.8);
                break;
            case PreferentialStrategyConstant.EVERY300RETURN30:
                cashAcceptObj = new CashReturn(300, 30);
                break;
            default:
                throw new IllegalArgumentException("未知优惠");
        }
    }

    public double getResult(double money) {
        return cashAcceptObj.acceptCash(money);
    }
}
