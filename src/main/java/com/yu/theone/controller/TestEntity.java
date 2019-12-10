package com.yu.theone.controller;

import com.yu.theone.entity.AImpl;
import com.yu.theone.interfaceT.AInterface;

/**
 * Created by shuwei.yu.
 * on 2019/11/4.
 */
public  class TestEntity {


    public static void main(String[] args) {
        AImpl a = new AImpl(new AInterface() {
            @Override
            public void out() {

            }
        });
    }

}
