package com.company;
import java.util.Arrays;


public class MinManAvg {

    public static void getMinManAvg(double[] arr) {
        // WRITE CODE HERE

        System.out.println("Среднее значение массива = " + Arrays.stream(arr).average().orElse(Double.NaN));
        System.out.println("Максимальное значение массива = " +  Arrays.stream(arr).max().orElse(Double.NaN));
        System.out.println("Минимальное значение массива = " + Arrays.stream(arr).min().orElse(Double.NaN));
    }

    public static void main(String[] args) {
        RandomArray random_array = new RandomArray();
        System.out.println("Печатаем среднее, максимальное и минимальные значения массива");
        getMinManAvg(random_array.createRandomArray(random_array.n));
        System.out.println();
    }
}
