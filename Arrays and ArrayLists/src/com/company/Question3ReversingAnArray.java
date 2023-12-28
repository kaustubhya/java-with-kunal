package com.company;


import java.util.Arrays;

public class Question3ReversingAnArray {
    public static void main(String[] args) {
        int[] arrOdd = {4,89,26,777,2};
        int[] arrEven = {10,5,952,0};
        reverse(arrOdd);
        reverse(arrEven);
        System.out.println(Arrays.toString(arrOdd));
        System.out.println(Arrays.toString(arrEven));

    }
    static void reverse (int [] arr){
        int start = 0;
        int end = arr.length -1;
//        since we are talking about the array indices here
//        therefore the end has to be one less, as index numbering starts from 0

        while(start < end){
//            swap
            swap(arr, start, end);

            start++;
            end--;
        }
    }
    static void swap(int [] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
