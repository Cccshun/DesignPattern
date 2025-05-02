package com.sysu.decorate;

public abstract class Finery implements Showable {
    protected Showable component;

    public void decorate(Showable component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
