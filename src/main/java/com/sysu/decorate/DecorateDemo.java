package com.sysu.decorate;

public class DecorateDemo {
    public static void main(String[] args) {
        DecoratePerson person = new DecoratePerson("Trump", 18, "man");
        // 服饰
        Sneaker sneaker1 = new Sneaker("black");
        Suit suit1 = new Suit("blue");
        Tie tie1 = new Tie("red");
        TShirts tShirts1 = new TShirts("white");
        // 装饰过程
        tShirts1.decorate(person);
        suit1.decorate(tShirts1);
        sneaker1.decorate(suit1);
        tie1.decorate(sneaker1);
        System.out.println("The first finery:");
        tie1.show();

        // 服饰
        Sneaker sneaker2 = new Sneaker("pink");
        Suit suit2 = new Suit("pink");
        TShirts tShirts2 = new TShirts("white");
        Tie tie2 = new Tie("green");
        // 装饰过程
        tShirts2.decorate(person);
        suit2.decorate(tShirts2);
        sneaker2.decorate(suit2);
        tie2.decorate(sneaker2);
        System.out.println("the second finery:");
        tie2.show();
    }
}

