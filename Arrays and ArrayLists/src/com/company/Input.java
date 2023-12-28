package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] scuba = new int[4];
/*        scuba[0] = 40;
        scuba[1] = 78;
        scuba[2] = 6;
        scuba[3] = 741;
   */
//        input using FOR LOOPS

        for(int i = 0; i < scuba.length; i++ ){
            scuba[i] = in.nextInt();

        }
//        method 1
        for(int i = 0; i < scuba.length; i++ ){
            System.out.print(scuba[i] + " ");
        }
//        method 2 - for each loop
        System.out.println();

        for (int numValueOfArray : scuba){
//            for every element in the array, print the element
            System.out.print(numValueOfArray + " ");  // here numValueOfArray represents the element of the array

        }
        System.out.println();

//        method 3 - Arrays.toString()
        System.out.println(Arrays.toString(scuba));



//        for strings, we can use enhanced for loops too
//        String[] arr = new String[4];
//        System.out.println(arr[0]);
//
//        for(String element:arr){
//        // here the datatype of every single element in the array arr is of type String
//            System.out.println(element);
//        }
    }
}