package com.sysu.bridge;

public class Square implements Shape {
    @Override
    public void draw(String color) {
        System.out.printf("This is a %s square\n", color);
    }
}
