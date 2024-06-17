package org.bbt.fold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void average() {
        int[] array = {1, 2, 3, 4, 5};
        Main main = new Main();
        double averageResult = main.calculateAverage(array);
        Assertions.assertEquals(3.0 , averageResult);
    }

    @Test
    public void squareMatrix() {

        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Main main = new Main();
        boolean isSquareMatrix = main.isSquareMatrix(squareMatrix);
        Assertions.assertEquals(true, isSquareMatrix);

    }

}
