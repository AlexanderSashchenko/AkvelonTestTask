package com.akvelon.matrixsequencefinder.validation;

import com.akvelon.matrixsequencefinder.validation.impl.MatrixValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = MatrixValidatorImpl.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MatrixValidator {
    String message() default "Inputted matrix is not valid. " +
            "Please check all subarray elements should consist only of 1 and 0 numbers.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
