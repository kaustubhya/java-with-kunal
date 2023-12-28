package com.company;

import java.util.Arrays;

public class Question4_SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] ={

                {44,33,56,14,-65},
                {82,4,0,3},
                {3,777,125,669,20,9},
                {6,23},
                {8,1,2},
                {47}
        };
        int target = 669;
        int []ans = search2D(arr,target);
        // format of the return value is :- [row, column]
        System.out.println(Arrays.toString(ans));


    }

    static int [] search2D(int [] [] arr, int target){     // here in 2D, we put an additional square bracket, look closely after int
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                if(arr [row][column] == target){
                    return new int[] {row, column}; // here too one additional square bracket
//                    here we are getting a new array of elements row and column in it
                }
            }
        }
     return new int[] {-1,-1};
    }
}
