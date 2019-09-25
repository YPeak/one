package com.yu.theone.entity;

/**
 * Created by shuwei.yu.
 * on 2019/4/12.
 */
public enum  State {

    STATE_OK("OK"),
    STATE_FAIL("FAIL");

    private String value;

    private State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
