package com.company;

import java.util.Arrays;

public class Question4_FirstAndLastPosition {
    public static void main(String [] args){
        int []array = {5,7,7,7,7,8,8,10};
        int target = 7;
        int [] ans = searchRange(array, target);
        System.out.println(Arrays.toString(ans));

//        Suppose if we wanted to know the index of 7, starting and ending both............

        int ans2 = searchIndex(array,target,true);
        int ans3 = searchIndex(array,target,false);
        System.out.println(ans2);
        System.out.println(ans3);

    }

    static int[] searchRange(int[] nums, int target){
        // look at the square brackets after int, it returns an array
        int [] ansInOutputShown = {-1,-1};
        // try to check for the first answer (first occurrence) first
        int firstPosition = searchIndex(nums, target, true);
        // going for the starting position first (left side)
        int endPosition = searchIndex(nums, target, false);
        // going for the last position after we found the first (right side)

        ansInOutputShown[0] = firstPosition;
        ansInOutputShown[1] = endPosition;


        // here we return the modified answer in an array
        return ansInOutputShown;
    }

    static int searchIndex(int[] nums, int target,boolean findStartingIndex){
        int ans = -1;  // this value will be returned if target is not found
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

           int middle = start + (end - start)/2;
           if(target > nums[middle]){
               start = middle + 1;
           }else if (target < nums[middle]){
               end = middle - 1;
           }else{
               // potential answer (ans) found
               ans = middle;

               if(findStartingIndex){
                   // this condition is true since it is a boolean
                  // there is a chance to get the first starting index,
                   // hence, we are going left and the end changes
                   end = middle - 1;
               } else{
                   start = middle + 1;
                   // we are going right here to find the
                   // last ending index of
                   // array nums till we are left with only one element in the array
                   // which is equal to the middle
               }

           }
        }

        return ans;
    }
}
