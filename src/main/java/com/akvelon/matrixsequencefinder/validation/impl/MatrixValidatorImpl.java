package com.akvelon.matrixsequencefinder.validation.impl;

import com.akvelon.matrixsequencefinder.model.MatrixDto;
import com.akvelon.matrixsequencefinder.validation.MatrixValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatrixValidatorImpl implements ConstraintValidator<MatrixValidator, MatrixDto> {

    @Override
    public boolean isValid(MatrixDto matrixDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        if (!matrixDto.getMatrix().getClass().isArray()) {
            return false;
        }
        int[][] matrix = matrixDto.getMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 || matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return false;
    }
}
