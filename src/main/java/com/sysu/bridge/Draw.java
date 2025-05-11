package com.sysu.bridge;

public class Draw extends DrawApi {

    protected String color;

    public Draw(String color, Shape shape) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw(color);
    }
}
