package com.sysu.bridge;

public class Rectangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.printf("This is a %s rectangle\n", color);
    }
}
