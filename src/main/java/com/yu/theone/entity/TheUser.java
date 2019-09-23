package com.yu.theone.entity;

import com.yu.theone.annotation.CheckAge;
import lombok.Data;

/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
@Data
public class TheUser {
    private String name;
    @CheckAge
    private int age;
    private String address;

}
