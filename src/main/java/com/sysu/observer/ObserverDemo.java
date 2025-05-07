package com.sysu.observer;


public class ObserverDemo {
    public static void main(String[] args) {
        Boss boss = new Boss();
        NBAObserver nbaObserver = new NBAObserver("Obama", boss);
        StockObserver stockObserver = new StockObserver("Trump", boss);

        boss.attach(nbaObserver);
        boss.attach(stockObserver);

        System.out.println(boss.getObserverList());
        boss.setState("huhansan is coming");
        boss.notifyObservers();
    }
}
