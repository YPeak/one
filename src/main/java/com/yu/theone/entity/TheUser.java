package com.yu.theone.entity;


import com.yu.theone.annotation.CheckAge;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
//@Builder(toBuilder = true)
//@Getter
@Data // 会成无参构造、getter、setter、equals、hashCode、toString方法--常用
//@AllArgsConstructor() // 生成所有变量的构造， 全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致。
////注意的是，同时使用@Data 和 @AllArgsConstructor 后 ，默认的无参构造函数失效，如果需要它，要重新设置 @NoArgsConstructor
//@NoArgsConstructor // 会生成无参构造
//@RequiredArgsConstructor
public class TheUser {
    private static final String aa = "1";
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @CheckAge
    private int age;
    private String address;

}
