package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {23,41,8,0,-6,-87};
        insertion(array);
        System.out.println(Arrays.toString(array));


    }

    static void insertion(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);

                }

                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
