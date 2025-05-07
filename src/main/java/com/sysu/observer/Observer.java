package com.sysu.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name) {
        this.name = name;
    }

    // There is a two-way reference between Observer and Subject.
    public String toString() {
        return String.format("observer{%s, %s}", name, sub.getState());
    }

    public abstract void update();
}

class StockObserver extends Observer {
    public StockObserver(String name) {
        super(name);
    }

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.printf("%s, %s关闭股票行情，继续工作。\n", sub.getState(), name);
    }
}

class NBAObserver extends Observer {
    public NBAObserver(String name) {
        super(name);
    }

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.printf("%s, %s关闭NBA直播，继续工作。\n", sub.getState(), name);
    }
}
