package com.sysu.proxy;

import com.sysu.common.Person;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pursuit implements GiveGift {
    private Person self;
    private Person target;

    @Override
    public void giveDolls() {
        System.out.printf("%s gives dolls to %s\n", self.getName(), target.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.printf("%s gives flowers to %s\n", self.getName(), target.getName());

    }

    @Override
    public void giveChocolate() {
        System.out.printf("%s gives chocolates to %s\n", self.getName(), target.getName());
    }
}
