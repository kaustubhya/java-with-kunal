package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr1 = new int [3] [];
//        int [] [] arr = {
//                {1,3,5}, // 0th index
//                {4,8}, // 1st index
//                {6,7,9,10,14,56}  }; // 2nd index
        // we do not need to specify the column size as the columns can be variable, see above
        // arr [2] = {6,7,9,10,14,56}
//        arr [2][1] = 7


        int[][] arr = new int[3][3];
//        mention both row nos and column nos to avoid from getting an error
        System.out.println(arr.length);   // no. of rows
//        // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
//                        since columns lengths could be variable, we as
//                        seen above took the length of every array of that row
//                        arr which was an array itself
                arr[row][column] = in.nextInt();
            }
        }

//         output

//        method 1
        for(int row = 0; row < arr.length; row++) {
//            press alt + enter at the highlighted for loop to get an enhanced for loop
            for(int column = 0; column < arr[row].length; column ++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }

        // method 2

        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
            // look at the above line of code
        }


//        method 3 - using an enhanced for loop
        for(int[] a : arr ){
//            here the datatype of every single element in an array (arr) is itself an array
            System.out.println(Arrays.toString(a));
        }
//      similarly we can use an enhanced for loop for strings too, see the inputs class
    }
}

