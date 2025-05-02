package com.sysu.prototype;

import com.sysu.common.Person;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume implements Cloneable {
    @Setter(AccessLevel.NONE)
    private String name;
    private String sex;
    private Integer age;
    private String company;
    private Person friend;

    public void display() {
        System.out.printf("name:{%s}, sex:{%s}, age:{%d}, experience:{%s}, friend:{%s}\n", name, sex, age, company, friend.toString());
    }

    public Resume clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        clone.setFriend(friend.clone());
        return clone;
    }
}

