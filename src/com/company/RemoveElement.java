package com.company;
import java.util.Arrays;


public class RemoveElement {
    public static int[] test_array = {3,3,8,3};
    //public static int[] test_array = {8,7,6,5,4,3,2,1,3}
    public static int elem = 3;

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

    public static void main(String[] args) {

        System.out.println("Печатаем копию массива " + Arrays.toString(test_array)+ ", в котором нет вхождений элемента " + elem);
        System.out.println("Массив: " + Arrays.toString(removeElement(test_array, elem)));
        System.out.println();

    }

}
