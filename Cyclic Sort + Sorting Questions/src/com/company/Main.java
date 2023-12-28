package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int array[] = {5,4,3,2,1};
	cyclic(array);
        System.out.println(Arrays.toString(array));

    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] < arr[correctIndex]){
                swap(arr,i, correctIndex);

            }else{
                i++;

            }
        }

    }

    static void swap(int [] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
