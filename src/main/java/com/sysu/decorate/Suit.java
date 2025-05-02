package com.sysu.decorate;

import lombok.AllArgsConstructor;

// 西装
@AllArgsConstructor
public class Suit extends Finery {
    private String color;

    @Override
    public void show() {
        super.show();
        System.out.printf("%s suit\n", color);
    }
}
