package com.company;

import java.util.Arrays;

public class Question5_SetMismatch {

    public static void main(String[] args) {

        int [] array = {2,1,4,2,6,5};
        int [] ans = findMissingAndDuplicates(array);
        System.out.println(Arrays.toString(ans));

        // order of output: - {Duplicate number, Missing Number}
    }

     static int[] findMissingAndDuplicates(int nums[]){
        // we will return an array here hence, the square brackets after int above
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }

        // Checking and Returning missing and Duplicate number in an array

         for(int index = 0; index < nums.length; index++){

             if(nums[index] != index + 1){
                 return new int [] {nums[index], index + 1};
             }

         }
         return new int [] {-1, -1};
     }

     static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
     }
}
