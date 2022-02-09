package com.company;

public class MatrixMultiply {
    public static double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    public static double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};

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
        System.out.println("Произведение матриц");
        printMatrix(matrix1);
        System.out.println("и");
        printMatrix(matrix2);
        System.out.println("равно =");
        printMatrix(matrixMultiply(matrix1, matrix2));
    }


    }
