package org.demo.example;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        try {
            int result = arrayValueCalculator.doCalc(new String[][]{{"1", "a", "3", "b"}, {"5", "c", "7", "d"}, {"9", "e", "f", "g"}});
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int result = arrayValueCalculator.doCalc(new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "v"}, {"r", "10", "11", "12"}, {"9", "10", "c", "12"}});
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            int result = arrayValueCalculator.doCalc(new String[][]{{"1", "2", "3", "4"}, {"5", "4", "3", "2"}, {"5", "6", "7", "8"}, {"9", "8", "7", "6"}});
            System.out.println("Result: " + result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
    }
}