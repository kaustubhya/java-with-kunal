package com.company;

import java.util.Arrays;

public class Question1Swapping {

//    Swapping the index (elements in that index) in an array

    public static void main(String[] args) {
        int [] arr = {1,5,9,13,458};
        swap(arr, 1,3);
//        1 and 3 are the index numbers to be swapped
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
