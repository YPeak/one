package com.yu.theone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: shuWei.yu
 * @date: 2019/9/29 0029
 *
 * 制定mapper范围
 * @MapperScan("com.yu.throne")
*/
@SpringBootApplication
//@ComponentScan("asdf")
@MapperScan("com.yu.theone")
public class TheOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheOneApplication.class, args);
	}

}
