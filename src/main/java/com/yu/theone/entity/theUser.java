package com.yu.theone.entity;

import lombok.Data;

/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
@Data
public class theUser {
    private String name;
    private String age;
    private String address;


    @Override
    public String toString() {
        return "theUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
