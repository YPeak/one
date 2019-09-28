package com.yu.theone.service;

import com.yu.theone.entity.TheUser;
import com.yu.theone.mapper.TestInterface;
import com.yu.theone.util.UtilMethod;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;

import javax.validation.constraints.Past;

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

        String errorMsg = UtilMethod.getAnnotationErrors(errors);
        return UtilMethod.notEmpty(errorMsg)?testAnnotationMapper.testAnnotationMethod("2"):errorMsg;
    }

    private TestAnnotationMapper testAnnotationMapper;
    private TestInterface testInterface;

    @Autowired
    private TestService(TestAnnotationMapper testAnnotationMapper,TestInterface testInterface){
        this.testAnnotationMapper = testAnnotationMapper;
        this.testInterface = testInterface;

    }

}


/**
 * @Description:
 * @Author: shuWei.yu
 * @date: 2019/9/28 0028
*/
@Mapper
interface TestAnnotationMapper{
    /**
     * @Description: 测试方法
     * @Author: shuWei.yu
     * @date: 2019/9/28 0028
     * @param id :
     * @return : java.lang.String
    */
    @Select("select age from test where id = ${id}")
    String testAnnotationMethod(@Param("id") String id);

}
