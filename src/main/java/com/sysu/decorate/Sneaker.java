package com.sysu.decorate;

import lombok.AllArgsConstructor;

// 裤子
@AllArgsConstructor
public class Sneaker extends Finery {
    private String color;

    @Override
    public void show() {
        super.show();
        System.out.printf("%s sneaker\n", color);
    }
}
