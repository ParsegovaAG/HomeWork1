package com.company;

import java.util.Arrays;

public class RandomArray {
    public static int n = 5;


    public static double[] createRandomArray(int n) {
        double[] RandomArray = new double[n];
        for(int i = 0; i < RandomArray.length; i++){
            RandomArray[i] = Math.random();
        }
        return RandomArray;
    }

    public static void main(String[] args) {

        System.out.println("Печатаем массив из " + n  + " элементов с рандомными значениями");
        System.out.println(Arrays.toString(createRandomArray(n)));
        System.out.println();
    }
}
