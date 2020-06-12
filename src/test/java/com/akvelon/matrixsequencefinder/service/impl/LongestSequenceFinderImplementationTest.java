package com.akvelon.matrixsequencefinder.service.impl;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestSequenceFinderImplementationTest {
    private LongestSequenceFinderImplementation longestSequenceFinder;

    @BeforeEach
    void setUp() {
        longestSequenceFinder = new LongestSequenceFinderImplementation();
    }

    @Test
    void checkEmptyMatrix() {
        int[][] emptyMatrix = new int[][]{{}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(emptyMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 0
                + " but actual size is " + sequenceSize + "!", 0, sequenceSize);
    }

    @Test
    void checkOneElementMatrix() {
        int[][] oneElementMatrix = new int[][]{{1}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 1
                + " but actual size is " + sequenceSize + "!", 1, sequenceSize);
    }

    @Test
    void checkSquareMatrixRow() {
        int[][] oneElementMatrix = new int[][]{{1, 0, 1}, {1, 0, 0}, {1, 1, 1}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 3
                + " but actual size is " + sequenceSize + "!", 3, sequenceSize);
    }

    @Test
    void checkSquareMatrixColumn() {
        int[][] oneElementMatrix = new int[][]{{1, 0, 1}, {1, 0, 0}, {1, 0, 1}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 3
                + " but actual size is " + sequenceSize + "!", 3, sequenceSize);
    }

    @Test
    void checkRectangleMatrixRow() {
        int[][] oneElementMatrix = new int[][]{{0, 0, 1, 1}, {1, 1, 1, 0}, {1, 0, 0, 0}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 3
                + " but actual size is " + sequenceSize + "!", 3, sequenceSize);
    }

    @Test
    void checkRectangleMatrixColumn() {
        int[][] oneElementMatrix = new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 0, 1, 0}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 3
                + " but actual size is " + sequenceSize + "!", 3, sequenceSize);
    }

    @Test
    void checkAsymmetricMatrixRow() {
        int[][] oneElementMatrix = new int[][]{{0, 0, 1, 1}, {1, 0}, {0}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 2
                + " but actual size is " + sequenceSize + "!", 2, sequenceSize);
    }

    @Test
    void checkAsymmetricMatrixColumn() {
        int[][] oneElementMatrix = new int[][]{{0, 0, 1, 1}, {1, 0}, {1}, {1, 0}};
        int sequenceSize = longestSequenceFinder.findLongestSequence(oneElementMatrix);
        Assert.assertEquals("Test failed, expected sequence size is " + 3
                + " but actual size is " + sequenceSize + "!", 3, sequenceSize);
    }

}
