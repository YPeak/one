package com.yu.theone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by shuwei.yu.
 * on 2019/12/10.
 */
@Entity // 实体类注解
@Data // lombok 插件，自动给属性生成 getter 和 setter 方法
//@Table(name = "users") 如果实体类名与表面不相同用 @Table 注解
public class User {

    @Id // 主键注解
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键自动递增注解
    private Integer userId;

    private String userName;
    private String userName2;

    @JsonIgnore // 若一个属性，不需要返回给前端，用 @JsonIgnore 注解
    private Integer userGender;

    private Integer userAge;

    private String email;

    @Transient // 若一个属性，不是数据库中的字段，用 @Transient 注解
    private String userInfo;
}
