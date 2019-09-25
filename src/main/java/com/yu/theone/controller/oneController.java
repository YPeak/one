package com.yu.theone.controller;

import com.yu.theone.entity.TheUser;
import com.yu.theone.service.TestAService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
@RestController
@ResponseBody
@RequestMapping("/yu")
@Api(tags = "类标识1",value = "类标识2")
public class oneController {

//    @RequestMapping("/te")// 如果用swagger2 用@RequestMapping注解 ，默认所有请求通用，改成GetMapping或者PutMapping即可
    @GetMapping("/te")
    @ApiOperation(value = "方法标识" ,notes = "方法描述")
    @SneakyThrows // 抛出异常 不用在方法上throw
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type",value = "XX类型",required = true,paramType = "query")
    })
    public String test(@RequestParam("type") String type)  {
        System.out.println(TestAService.testA());
        return new TheUser().toString();
    }

    public static void main(String[] args) {
//        System.out.println(P1.aa());
    }

    @Autowired
    TestAService TestAService;
}
