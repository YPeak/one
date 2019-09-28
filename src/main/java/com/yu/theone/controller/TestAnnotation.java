package com.yu.theone.controller;

import com.yu.theone.entity.TheUser;
import com.yu.theone.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description:
 * @Author: shuWei.yu
 * @date: 2019/9/28 0028
*/
@Slf4j
@RestController
@RequestMapping("/tesAnnotation")
@Api(value = "测试自定义验证注解")
public class TestAnnotation {

    /**
     * @Description:
     * @Author: shuWei.yu
     * @date: 2019/9/28 0028
     * @param theUser :
     * @param errors :
     * @return : java.lang.String
     * 要用注解 要添加@Valid 注解
     */
    @ApiOperation(value = "方法标识" ,notes = "方法描述")
    @RequestMapping(value = "/testAge",method = RequestMethod.POST,consumes = {"application/json;charset=utf-8"})
    public String checkAge(@RequestBody @Valid TheUser theUser , Errors errors){
          return testService.testB(theUser,errors);
        }

        @Autowired
        private TestService testService;
}
