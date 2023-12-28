package com.company;

public class Question6_FirstMissingPositive {

    public static void main(String [] args){
        int array[] = {3,4,1,-1,2,3,4};
        int ans = firstMissingPositive(array);
        System.out.println(ans);

    }

    static int firstMissingPositive(int [] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
//                See the conditions of if, we are ignoring specific cases
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }

        }
        // Check and return the first missing number
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
//        eg. if numbers from 1 to 4 are there, then to return 5, we do N + 1 as N = 4.
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
