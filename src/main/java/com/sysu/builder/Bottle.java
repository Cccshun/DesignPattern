package com.sysu.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke cola";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}

class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi Cola";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
