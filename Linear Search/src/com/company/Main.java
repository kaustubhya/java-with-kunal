package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {23, 16, 777, 54, 2, 49, 18, 3, 0, 874, 5641, 2};
        int target = 874;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);
        boolean ans3 = linearSearch3(nums, target);
        System.out.println(ans3);
    }

//    search in the array; return the index if the item is found
//    otherwise if the item is not found; return -1

    static int linearSearch(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a "for" loop

        for(int index = 0; index < arr.length; index++ ){
            // check for element at every index of the array if it is equal to the target
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




    //    search in the array; return the element if the item is found
    //    otherwise if the item is not found; return -1

    static int linearSearch2(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a "for" loop

        for(int index = 0; index < arr.length; index++ ){
            // check for element at every index of the array if it is equal to the target
            int element = arr[index];
            if(element == target){
                return element;

//                to rename:- select word -> right click -> refactor -> rename

            }


        }

//        this line will execute if none of the return statements above have executed
//        hence:- target not found (return -1)
        return -1;

    }

//    search the target and return true/ false

    static boolean linearSearch3(int [] arr, int target){
        if (arr.length == 0){
            return false;
        }

        // run a "for" loop

        for(int index = 0; index < arr.length; index++ ){
            // check for element at every index of the array if it is equal to the target
            int element = arr[index];
            if(element == target){
                return true;

//                to rename:- select word -> right click -> refactor -> rename

            }


        }

//        this line will execute if none of the return statements above have executed
//        hence:- target not found (return false)
        return false;

    }


}
