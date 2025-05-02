package com.sysu.proxy;


import com.sysu.common.Person;

public class ProxyDemo {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Pursuit(new Person("Biden", 80, "man"), new Person("Peloxi", 72, "female")));
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}


