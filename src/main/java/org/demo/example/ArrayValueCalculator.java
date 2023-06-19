package org.demo.example;

public class ArrayValueCalculator {
    public int doCalc(String[][] matrix) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != 4 || matrix[i].length != 4) throw new ArraySizeException("Make matrix size 4x4");

                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(e.getMessage() + " in position " + i + "-" + j + " is wrong symbol");
                }
            }
        }
        return sum;
    }
}
