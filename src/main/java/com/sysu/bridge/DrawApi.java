package com.sysu.bridge;

public abstract class DrawApi {
    protected Shape shape;

    public DrawApi(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
