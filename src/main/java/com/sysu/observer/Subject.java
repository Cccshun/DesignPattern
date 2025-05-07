package com.sysu.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Subject {
    private String state;
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

class Boss extends Subject {

}

class Secretary extends Subject {

}
