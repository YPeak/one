package com.yu.theone.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shuwei.yu.
 * on 2019/12/12.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TestJPA {
    @Id
    private String age;
    private String address;
}
