package com.lucas.mergepatch.annotations;

import com.lucas.mergepatch.annotations.validator.ContentNotBlankValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(
        validatedBy = {ContentNotBlankValidator.class}
)
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ContentNotBlank {

    String message() default "Não pode ser vazio ou nulo.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
