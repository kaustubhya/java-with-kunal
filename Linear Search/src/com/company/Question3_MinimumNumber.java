package com.company;

public class Question3_MinimumNumber {
    public static void main(String[] args) {
        int[] nums = {18,12,-7,3,14,28};
        int min = minimumNumber(nums);
        System.out.println(min);

    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int minimumNumber(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            // we took i = 1 as zero has already been defined
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;

    }
}


