package com.company;

public class BonusQuestion_MaximumNumberIn2DArray {
    public static void main(String[] args) {
        int arr[][] ={

                {44,33,56,14,-65},
                {82,4,0,3},
                {3,777,125,669,20,9},
                {6,23},
                {8,1,2},
                {47}
        };
        int ans = search2DMax(arr);
        System.out.println(ans);


    }

    static int search2DMax(int [] [] arr){
        // here we only need a number hence, no additional square bracket after int
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                if(arr [row][column] > max){
                   max =  arr[row][column];

                }
            }
        }
        return max;
    }

}
