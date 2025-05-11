package com.sysu.bridge;

public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.printf("This is a %s circle\n", color);
    }
}
