package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question4_MultipleDuplicateElements {
    public static void main(String[] args) {
        int [] array = {4,3,2,7,8,3,2,1};
        List ans = findDuplicates(array);
        System.out.println(ans);


    }

    static List<Integer> findDuplicates(int [] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        List <Integer> answer = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1) {
                answer.add(arr[index]);
            }
        }

        return answer;
        // as this is a list, if there are no duplicates, the list will not show anything.
//        But if there are duplicates, they will get added in the list and finally be returned
//        and showed in the array output
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

