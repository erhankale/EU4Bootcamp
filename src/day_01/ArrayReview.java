package day_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReview {

    public static void main(String[] args) {

        int[] array1 = new int[2]; //size is fixed -->> 2
        array1[0] = 1;
        array1[1] = 2;

        System.out.println(Arrays.toString(array1));

        Integer[] array2 = {1,2,3,4,5};

        int[][] arra2D = { {} , {} }; //multidimensional Array

        List<ArrayList<Integer>> list = new ArrayList<>(); //List of Arraylist


        System.out.println("============================");

        int[] numbers = {1,2,3,4,5};

        System.out.println(numbers[2]);

        for (int i = 0 ; i < numbers.length ; i++ ){

            System.out.println(numbers[i]);

        }

        System.out.println("-------------------");

        for ( int each : numbers) {
            System.out.println(each);

        }


    }
}
