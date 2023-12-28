package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        fun(2,56,44,88,777,61,5,6,2);
        multiple(13,4,"Cash", "Obed");
    }

    static void multiple(int a, int b, String ...food){
        System.out.println(a + " " + b + " " + Arrays.toString(food));
//        look at the output line, very important


    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));

    }
}