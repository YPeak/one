package com.yu.theone.service;

import com.yu.theone.entity.TheUser;
import com.yu.theone.mapper.TestInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;

/**
 * @Description:
 * @Author: shuWei.yu
 * @date: 2019/9/28 0028
*/
@Slf4j
@Service
public class TestService {

    public String testA() throws Exception {
        if(false){
            throw new Exception("11");
        }
        log.info("12");
        String aa = testInterface.testIA("1234");
        System.out.println("service层方法:"+aa);
        return "打印";
    }

    public String testB(TheUser theUser , Errors errors)  {


        return "";
    }

    private TestInterface testInterface;

    @Autowired
    private TestService(TestInterface testInterface){
        this.testInterface = testInterface;

    }

}
