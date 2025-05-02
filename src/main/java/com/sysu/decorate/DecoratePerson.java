package com.sysu.decorate;

import com.sysu.common.Person;

public class DecoratePerson extends Person implements Showable {

    public DecoratePerson(String name, Integer age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void show() {
        System.out.printf("The dress of %s as follows:\n", getName());
    }
}
