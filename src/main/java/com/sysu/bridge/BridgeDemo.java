package com.sysu.bridge;


public class BridgeDemo {
    public static void main(String[] args) {
        DrawApi drawApi = new Draw("blue", new Circle());
        drawApi.draw();

        drawApi = new Draw("red", new Square());
        drawApi.draw();

        drawApi.shape = new Rectangle();
        drawApi.draw();
    }
}

