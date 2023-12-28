package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = {3,1,-5,4,0,2};
	selection(array);
        System.out.println(Arrays.toString(array));

    }

    static void selection(int[] array){
        // external loop
        for(int i = 0; i < array.length; i++){
            // find the max item in the remaining array and swap with correct index
            int lastIndexForInternalLoop = array.length - i - 1;

            // search for the maxIndex
            int maxIndex = getMaxIndex(array, 0, lastIndexForInternalLoop);

            // swap the maxIndex and the lastIndexForInternalLoop
            swap(array, maxIndex, lastIndexForInternalLoop);


        }
    }

    static int getMaxIndex(int [] nums, int start, int end){
        int max = start;
        // assuming max element is at the starting index


        // internal loop

        for(int i = start; i <= end; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
