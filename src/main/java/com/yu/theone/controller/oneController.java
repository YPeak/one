package com.yu.theone.controller;

import com.yu.theone.entity.TheUser;
import com.yu.theone.service.TestAService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public String test(){
        System.out.println(TestAService.testA());
        return new TheUser().toString();
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>() {{add(0); add(-1);}};
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2, 4, -9));
        list1.addAll(list2);
        System.out.println(list1);
        list2.set(0, 100000);
        System.out.println(list1);//深复制
        System.out.println(list2);

        //功能性展示
        Collections.addAll(list2, 34, 67, 78);
        System.out.println(list2);
        list2.addAll(Arrays.asList(34, 67, 78));
        System.out.println(list2);
        System.out.println();
    }

    @Autowired
    TestAService TestAService;
}
