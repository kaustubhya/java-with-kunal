package com.company;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,5,4,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

//         mind it here nums and arr are the same and arr is just a copy of the nums array
//        just as we have seen in the previous videos



    }

    static void change(int[] arr){
        arr[0] = 458;
    }


}
