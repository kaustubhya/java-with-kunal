package com.company;

import java.util.Arrays;

public class ChangeArrayValue {
    public static void main(String[] args) {
        int [] arr = {1, 56, 55, 2, 0, 77, 6};
        change(arr);
//        This is the reference variable
        System.out.println(Arrays.toString(arr));

    }

    static void change(int [] nums){
        nums[0] = 102;
//        You made a change to this object via the reference variable, Hence, same object will be changed.
    }
}
