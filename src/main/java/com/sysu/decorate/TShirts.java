package com.sysu.decorate;

import lombok.AllArgsConstructor;

// 短袖
@AllArgsConstructor
public class TShirts extends Finery {
    private String color;

    @Override
    public void show() {
        super.show();
        System.out.printf("%s t-shift\n", color);
    }
}
