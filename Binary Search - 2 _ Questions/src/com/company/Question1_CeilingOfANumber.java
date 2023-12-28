package com.company;

public class Question1_CeilingOfANumber {
    public static void main(String[] args) {
        int nums[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(nums,target);
        System.out.println(ans);
    }

    //  returns the index of the smallest number >= target
    static int ceiling(int [] arr, int target){
        // return the index no.
        // return start, if the target does not exist inside the array,
        // it then returns the index of the latest start number which is the ceiling of the number


        // but what if the target number is greater than the greatest element in the array
        if(target > arr[arr.length - 1]){    // take care of the square brackets or you will
            // get the array length instead of the last element of the array
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        // here these are index numbers


        while(start <= end){
            // find the middle element
            // middle = (start - end) / 2 might give us an error, hence use the following:-
            int middle = start + (end- start) / 2;

            if(target > arr[middle]){
                start = middle + 1;          // arr[middle] means the element at the middle
            }
            else if(target < arr[middle]){
                end = middle - 1;
            }else{
                return middle;
                // we have found the target
            }
        }

        return start;              // ceiling found

    }
}
