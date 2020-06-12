package com.akvelon.matrixsequencefinder.service.impl;

import com.akvelon.matrixsequencefinder.service.LongestSequenceFinder;
import org.springframework.stereotype.Service;

@Service
public class LongestSequenceFinderImplementation implements LongestSequenceFinder {
    @Override
    public int findLongestSequence(int[][] matrix) {
        int[][] rotatedMatrix = rotateMatrix(matrix);
        return Math.max(getLongestSequence(matrix), getLongestSequence(rotatedMatrix));
    }

    private int[][] rotateMatrix(int[][] matrix) {
        int highestRowElements = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                int currentRowElements = j + 1;
                if (currentRowElements > highestRowElements) {
                    highestRowElements = currentRowElements;
                }
            }
        }
        int[][] rotatedMatrix = new int[highestRowElements][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private int getLongestSequence(int[][] matrix) {
        int longestSequence = 0;
        int currentSequence = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 1) {
                    currentSequence++;
                } else {
                    if (currentSequence > longestSequence) {
                        longestSequence = currentSequence;
                    }
                    currentSequence = 0;
                }
            }
            if (currentSequence > longestSequence) {
                longestSequence = currentSequence;
            }
            currentSequence = 0;
        }
        return longestSequence;
    }
}
