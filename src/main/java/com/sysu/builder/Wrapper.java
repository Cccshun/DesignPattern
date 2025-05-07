package com.sysu.builder;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 60.0f;
    }
}

class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}


