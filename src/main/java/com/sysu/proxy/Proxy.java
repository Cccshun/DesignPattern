package com.sysu.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Proxy implements GiveGift {
    private GiveGift pursuit;

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
