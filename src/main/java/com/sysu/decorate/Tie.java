package com.sysu.decorate;

import lombok.AllArgsConstructor;

// 领带
@AllArgsConstructor
public class Tie extends Finery {
    private String color;

    @Override
    public void show() {
        super.show();
        System.out.printf("%s tie\n", color);
    }
}
