package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] ros;
//        declaration
        ros = new int[5];
//        initialization
        ros[0] = 2;
        ros[1] = 5;
        ros[2] = 89;
        ros[3] = 79;
        ros[4] = 23415;

       System.out.println(ros[1]);
        System.out.println(Arrays.toString(ros));
//        As no values were assigned to the array from the beginning, it took its default value
//        i.e. 0 and outputted it.
        int[] saw = new int[2];
        System.out.println(saw[1]);

        String[] arr = new String[5];
        System.out.println(arr[3]);
//        for string array the output was null


        String[] val = {"Jeet", "Kudail", "Shanky"};
        System.out.println(Arrays.toString(val));

    }
}
