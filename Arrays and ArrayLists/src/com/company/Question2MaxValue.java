package com.company;

public class Question2MaxValue {
    public static void main(String[] args) {
        int [] arr = {1,3,23,9,18,456};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
//        1 and 4 are index nos.
    }

//    imagine that the array is not empty

    static int max(int[] arr){
        int maxValue = arr[0];
//        declaring arr[0] as the max value
        for(int i = 1; i < arr.length; i++){
//            here i starts from 1, as 0 is already initialized
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


//    to find the maximum value in a given range
//    adding some edge-cases too
    static int maxRange(int[] arr, int start, int end){

//        edge case 1
        if(end < start){
            return -1;
        }

//        edge case 2
        if(arr == null){
            return -1;
        }

        int maxValue = arr[start];
        for(int i = start; i <= end; i++){

//            edge case 3
            if(arr.length == 0){
                return -1;
            }

            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
