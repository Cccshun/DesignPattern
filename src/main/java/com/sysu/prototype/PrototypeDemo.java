package com.sysu.prototype;

import com.sysu.common.Person;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("Musk", "man", 55, "Tesla", new Person("Trump", 88, "man"));
        resume.display();

        Resume clone = resume.clone();
        resume.setSex("female");
        resume.setAge(80);
        resume.getFriend().setName("Obama");
        resume.display();
        clone.display();
    }
}
