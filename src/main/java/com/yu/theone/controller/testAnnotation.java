package com.yu.theone.controller;

import com.yu.theone.entity.TheUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
    @RequestMapping(value = "/testAge",method = RequestMethod.POST,consumes = {"application/json;charset=utf-8"})
    // 要用注解 要添加@Valid 注解
    public String checkAge(@RequestBody @Valid TheUser theUser , BindingResult bindingResult){
//        List<ObjectError> aa = errors.getAllErrors();
//        errors.hasErrors();
//        return "1";
        if(bindingResult.hasErrors()){
            for (ObjectError error:
            bindingResult.getAllErrors()) {
                System.out.println(error.getDefaultMessage());

            }
//            System.out.println( "错误原因为："+bindingResult.getAllErrors().get(0).getDefaultMessage());
            return "创建对象失败 false";

        }else {
          return "创建对象成功";
        }
}

}
