package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question2_MissingNumbersArrayList {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,3,2,1};
        List ans = findDisappearedNumbers(array);
//        Here since we used lists, output will also be in list form
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int [] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
//            Remember if range is from 1 to N, then :
//            Every element will be at:  index = value - 1.
//            Value is the particular element at that index
//            Also value = index + 1;  will be used later

            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        List <Integer> checkAndReturn = new ArrayList <> ();
//        Here we are using lists since it was asked in leetcode and it's quite easy
//         to return multiple numbers in the form of an array list
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){

//                if we follow the theory, we see that element at index 3 = 4;
//                element at index 4 = 5 etc.
//                here index + 1 means the value of element
//                eg. if element at index[6 (index no.)] != 7 (6 + 1 (index + 1))
//                here 7 is the value of the element, so if 7 is not at index 6, then return 7

                checkAndReturn.add(index + 1);
//                New way of writing return statement in an ArrayList

            }
        }

        return checkAndReturn;
//        Here if we find the missing numbers, it will be shown on the list, otherwise, the list will be empty


    }
    static void swap(int [] arr, int first, int second){

        int temp = arr[first];
        arr [first] = arr [second];
        arr[second] = temp;

    }
}
