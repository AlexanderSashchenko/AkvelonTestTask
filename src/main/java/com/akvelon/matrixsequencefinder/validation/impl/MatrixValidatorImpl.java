package com.akvelon.matrixsequencefinder.validation.impl;

import com.akvelon.matrixsequencefinder.model.MatrixDto;
import com.akvelon.matrixsequencefinder.validation.MatrixValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatrixValidatorImpl implements ConstraintValidator<MatrixValidator, MatrixDto> {

    @Override
    public boolean isValid(MatrixDto matrixDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        try {
            for (int[] ints : matrixDto.getMatrix()) {
                for (int anInt : ints) {
                    if (anInt != 0 && anInt != 1) {
                        return false;
                    }
                }
            }
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
}
