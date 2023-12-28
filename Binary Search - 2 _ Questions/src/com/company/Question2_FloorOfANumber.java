package com.company;

public class Question2_FloorOfANumber {
    public static void main(String[] args) {
        int nums[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(nums,target);
        System.out.println(ans);
    }


    //  returns the index of the greatest number <= target
    static int floor(int [] arr, int target){
        // return the index no.
        // return end, if the target does not exist inside the array,
        // it then returns the index of the latest end number which is the floor of the number


        // but what if the target number is smaller than the smallest element in the array
        if(target < arr[0]){    // take care of the square brackets

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

        return end;          // floor found

    }
}
