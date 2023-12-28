package com.company;

public class Main {

    public static void main(String[] args) {
        int [] nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        // ascending order
        int target = 45;
        // index of 45 is 11.
        int ans = binarySearch(nums,target);
        System.out.println(ans);


        int [] nums2 = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};
//        descending order
        int target2 = 22;
        // index of 22 is 2.
        int ans2 = binarySearch2(nums2,target2);
        System.out.println(ans2);

    }

    static int binarySearch(int [] arr, int target){
        // return the index no.
        // return -1, if the target does not exist

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
                // we have found the answer
            }
        }

        return -1;

    }


    // Descending order
    static int binarySearch2(int [] arr, int target){
        // return the index no.
        // return -1, if the target does not exist

        int start = 0;
        int end = arr.length - 1;
        // here these are index numbers


        while(start <= end){
            // find the middle element
            // middle = (start - end) / 2 might give us an error, hence use the following:-
            int middle = start + (end- start) / 2;

            if(target < arr[middle]){
                start = middle + 1;          // arr[middle] means the element at the middle
            }
            else if(target > arr[middle]){  // only the '>' and '<' are inversed here
                end = middle - 1;
            }else{
                return middle;
                // we have found the answer
            }
        }

        return -1;

    }
}
