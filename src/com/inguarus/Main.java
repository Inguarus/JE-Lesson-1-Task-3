package com.inguarus;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {4, 8, 32, 18, 10, 23, 35, 17, 57};

        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println("Average of the entered numbers: " + average);
    }
}
