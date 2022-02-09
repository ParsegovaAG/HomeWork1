package com.company;
import java.util.Arrays;


public class MinManAvg {

    public static int n = 5;


    private static double[] createRandomArray(int n) {
        double[] RandomArray = new double[n];
        for(int i = 0; i < RandomArray.length; i++) RandomArray[i] = Math.random();
        return RandomArray;
    }

    public static void getMinManAvg(double[] arr) {
        // WRITE CODE HERE

        System.out.println("Среднее значение массива = " + Arrays.stream(arr).average().orElse(Double.NaN));
        System.out.println("Максимальное значение массива = " +  Arrays.stream(arr).max().orElse(Double.NaN));
        System.out.println("Минимальное значение массива = " + Arrays.stream(arr).min().orElse(Double.NaN));
    }

    public static void main(String[] args) {

        System.out.println("Печатаем среднее, максимальное и минимальные значения массива");
        getMinManAvg(createRandomArray(n));
        System.out.println();
    }
}
