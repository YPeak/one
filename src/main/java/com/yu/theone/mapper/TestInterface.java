package com.yu.theone.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by shuwei.yu.
 * on 2019/4/9.
 */
@Mapper
public interface TestInterface {

    @Select("select a.id from user a where a.name = #{name}")
    String testIA(@Param("name") String name);

}
