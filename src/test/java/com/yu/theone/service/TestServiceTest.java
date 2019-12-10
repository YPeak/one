package com.yu.theone.service;

import com.yu.theone.TheOneApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by shuwei.yu.
 * on 2019/12/10.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TheOneApplication.class})// 指定启动类
public class TestServiceTest {

    @Autowired
    TestService testService;

    @Before
    public void befor(){
    }

    @Test
    public void testA() throws Exception {
        testService.testA();
    }

    @Test
    public void testB() throws Exception {

    }

}