package com.yu.theone.service;

import com.yu.theone.mapper.TestInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shuwei.yu.
 * on 2019/4/9.
 */
@Slf4j
@Service
public class TestAService {

    public String testA(){
        log.info("12");
        String aa = testInterface.testIA("1234");
        System.out.println("service层方法:"+aa);
        return "打印";
    }
    @Autowired
    TestInterface testInterface;
}
