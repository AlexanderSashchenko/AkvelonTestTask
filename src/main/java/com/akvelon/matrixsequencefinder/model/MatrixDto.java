package com.akvelon.matrixsequencefinder.model;

import com.akvelon.matrixsequencefinder.validation.MatrixValidator;
import lombok.Data;

@MatrixValidator
@Data
public class MatrixDto {
    private int[][] matrix;
}
