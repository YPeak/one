package com.yu.theone.controller;

import java.math.BigDecimal;

/**
 * Created by shuwei.yu.
 * on 2019/11/4.
 */
public  class TestEntity {

    private String name ;
    private static String age = "1";
    private final static  String address = "1";


    public  static void main(String[] args) {
        System.out.println(age);
        changeSomething();
        System.out.println(age);
        String aa = "0.1132";
        String cc = "0.1133";
        double bb = Double.valueOf(aa);
        double ee = Double.valueOf(cc); 
        System.out.println(bb+ee);

        double c1 = 0.1132;
        double c2 = 0.1133;
        BigDecimal a1 = new BigDecimal(c1);
        BigDecimal a2 = new BigDecimal(c1);
        System.out.println(a1.add(a1));

        BigDecimal b1 = new BigDecimal(aa);
        BigDecimal b2 = new BigDecimal(cc);
        System.out.println(b1.add(b2));

    }

    private static void changeSomething(){

        age = "122";
    }


}
