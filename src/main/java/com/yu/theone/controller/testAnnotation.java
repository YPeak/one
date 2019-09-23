package com.yu.theone.controller;

import com.yu.theone.entity.TheUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tesAnnotation")
@Api(value = "测试自定义验证注解")
public class testAnnotation {

    @ApiOperation(value = "方法标识" ,notes = "方法描述")
    @RequestMapping(value = "/测试校验年龄",method = RequestMethod.POST,consumes = {"application/json;charset=utf-8"})
    // 要用注解 要添加@Valid 注解
    public String checkAge(@Valid @RequestBody TheUser theUser){
        return "创建对象成功";
}

}
