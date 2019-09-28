package com.yu.theone.annotation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @Description:
 * @Author: shuWei.yu
 * @date: 2019/9/28 0028
 * https://www.cnblogs.com/codeingthink/p/9237825.html  spring 常用注解
*/
@Target({
    ElementType.FIELD,
//        ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckAge.CheckAgeImp.class)
/**
 * @Description: 校验年龄注解
 * @Author: shuWei.yu
 * @date: 2019/9/28 0028
 * @param null :
 * @return : null
 *
 *
*/
public @interface CheckAge {
    String message() default "年龄不能小于18岁";
    Class<? extends Payload>[] payload() default {};
    Class<?>[] groups() default {};

    class CheckAgeImp implements ConstraintValidator<CheckAge,Integer> {
        @Override
        public void initialize(CheckAge constraintAnnotation) {

        }

        @Override
        public boolean isValid(Integer value, ConstraintValidatorContext context) {
            return value>=18;
        }
    }

}

