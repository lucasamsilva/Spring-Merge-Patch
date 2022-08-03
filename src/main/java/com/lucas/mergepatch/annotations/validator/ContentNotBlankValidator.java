package com.lucas.mergepatch.annotations.validator;

import com.lucas.mergepatch.annotations.ContentNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.nonNull;

public class ContentNotBlankValidator implements ConstraintValidator<ContentNotBlank, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return nonNull(s) && !s.trim().equals("");
    }
}
