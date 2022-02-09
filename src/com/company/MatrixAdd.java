package com.company;
import java.util.Arrays;

public class MatrixAdd {
    public static double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    public static double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};


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

    public static void printMatrix(double[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {

        System.out.println("Сумма матриц:");
        printMatrix(matrix1);
        System.out.println("и");
        printMatrix(matrix2);
        System.out.println("равна =");
        printMatrix(matrixAdd(matrix1, matrix2));
        System.out.println("или в упрощенной записи:");
        System.out.println(Arrays.deepToString(matrixAdd(matrix1, matrix2)));
        System.out.println();

    }

}
