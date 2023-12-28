package com.company;

public class Question2_SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18,12,-7,5,14,28};
        int target = 5;
        int ans = linearSearchRange(nums,target,1,4);
        System.out.println(ans);

    }
        static int linearSearchRange(int [] arr, int target, int start, int end){
            if (arr.length == 0){
                return -1;
            }

            // run a "for" loop

            for(int index = start; index <= end; index++ ){
                // check for element at every index of the array, from start to end, if it is equal to the target
                int element = arr[index];
                if(element == target){
                    return index;

//                to rename:- select word -> right click -> refactor -> rename

                }


            }

//        this line will execute if none of the return statements above have executed
//        hence:- target not found (return -1)
            return -1;

        }
}
