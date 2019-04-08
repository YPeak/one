package com.yu.theone.entity;

import com.yu.theone.annotation.testAnnotation;

/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
public class theUser {
    private String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @testAnnotation.annotationA(age = "12")
    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "theUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
