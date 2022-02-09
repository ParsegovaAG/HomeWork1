package com.company;

import java.util.Arrays;

public class Main {

    public static char[] createAlphabet(){
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = (char)(97 + i);
        }
        return alphabet;

    }

    public static void printAlphabet() {
        /* WRITE CODE HERE */
        char[] alphabet = createAlphabet();
        for (int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i]);
        }
        System.out.println();

    }

    public static void printReverseAlphabet() {
        /* WRITE CODE HERE */
        char[] alphabet = createAlphabet();

        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[alphabet.length-i-1]);
        }
        System.out.println();

    }

    public static double[] createRandomArray(int n) {
        double[] RandomArray = new double[n];
        for(int i = 0; i < RandomArray.length; i++){
            RandomArray[i] = Math.random();
        }
        return RandomArray;
    }

    public static void getMinManAvg(double[] arr) {
        // WRITE CODE HERE

        System.out.println("Среднее значение массива = " + Arrays.stream(arr).average().orElse(Double.NaN));
        System.out.println("Максимальное значение массива = " +  Arrays.stream(arr).max().orElse(Double.NaN));
        System.out.println("Минимальное значение массива = " + Arrays.stream(arr).min().orElse(Double.NaN));
    }


    public static int[] removeElementByIndex(int[] array, int elem) {
        // WRITE CODE HERE

        int[] result = new int[array.length - 1]; // Array which will contain the result.
// Copy the elements at the left of the index.
        System.arraycopy(array, 0, result, 0, elem);
// Copy the elements at the right of the index.
        System.arraycopy(array, elem+1, result, elem, array.length - elem-1);
        return result;
    }
    public static int[] removeElement(int[] array, int elem) {
        // WRITE CODE HERE
        int[] newArray=null;
        int j=0;
        for(int i=0;i< array.length;i++){
            if (array[i]==elem)
            {
                if (newArray ==null)
                {
                    newArray=removeElementByIndex(array,i);
                }
                else
                {
                    newArray=removeElementByIndex(newArray,i-j);
                }
                j++;
            }


        }

        return newArray;
    }



    public static double[][] matrixAdd(double[][] matrix1, double[][] matrix2) {
        // WRITE CODE HERE
        double[][] sum_matrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < sum_matrix.length; i++) {
            for (int j = 0; j < sum_matrix[0].length; j++) {
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum_matrix;
    }

    public static double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
        double[][] mul_matrix = new double[matrix1.length][matrix2[0].length];
        for (int i=0; i<mul_matrix[0].length; i++) {
            for (int j = 0; j < mul_matrix.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    mul_matrix[i][j] = mul_matrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul_matrix;
    }

    public static void printMatrix(double[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

    }




        public static void main(String[] args) {
        System.out.println("Печатаем алфавит в прямом порядке");
        printAlphabet();
        System.out.println();

        System.out.println("Печатаем алфавит в обратном порядке");
        printReverseAlphabet();
        System.out.println();

        int n = 5;
        System.out.println("Печатаем массив из " + n  + " элементов с рандомными значениями");
        double[] arr = createRandomArray(n);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Печатаем среднее, максимальное и минимальные значения массива");
        getMinManAvg(arr);
        System.out.println();


        //int[] test_array = {8,7,6,5,4,3,2,1,3}
        int[] test_array = {3,3,8,3};
        int elem = 3;
        System.out.println("Печатаем копию массива " + Arrays.toString(test_array)+ ", в котором нет вхождений элемента " + elem);
        //System.out.println(Arrays.toString(removeElementByIndex(test_array, elem)));
        System.out.println(Arrays.toString(removeElement(test_array, elem)));

        System.out.println();


        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        System.out.println("Сумма матриц:");
        printMatrix(matrix1);
        System.out.println("и");
        printMatrix(matrix2);
        System.out.println("равна =");
        printMatrix(matrixAdd(matrix1, matrix2));
        System.out.println("или в упрощенной записи:");
        System.out.println(Arrays.deepToString(matrixAdd(matrix1, matrix2)));
        System.out.println();

        System.out.println("Произведение матриц равно");
        printMatrix(matrixMultiply(matrix1, matrix2));



    }
}