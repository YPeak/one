package com.yu.theone.controller;

import com.yu.theone.entity.theUser;
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
public class oneController {

    @RequestMapping("/t")
    public String test(){
        return new theUser().toString();
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
}
