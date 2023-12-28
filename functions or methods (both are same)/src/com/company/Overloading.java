package com.company;

public class Overloading {
    public static void main(String[] args) {
        fun(5555);
        fun(12,5);
    }
    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);

    }
    static void fun(int a, int b) {
        System.out.println("Second One");
        System.out.println(a + " " + b);
    }
}
