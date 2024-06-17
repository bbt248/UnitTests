package org.bbt.fold;

public class Main {

    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути пустим або null");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Матриця не може бути null");
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }
        return true;
    }

}

