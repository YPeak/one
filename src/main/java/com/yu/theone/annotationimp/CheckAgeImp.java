package com.yu.theone.annotationimp;

import com.yu.theone.annotation.CheckAge;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckAgeImp implements ConstraintValidator<CheckAge,Integer> {
    @Override
    public void initialize(CheckAge constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value>=18;
    }
}
