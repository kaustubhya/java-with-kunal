package com.company;

public class Example_2_Recursion {
    public static void main(String[] args) {

        print(1);

    }

    static void print(int n){
        if(n ==5 ){
            System.out.println(5);
            return;
            // to end the recursive call
            // base condition
        }

        System.out.println(n);


        // this is called tail recursion, this is the last function call
        print(n + 1);   // Recursive call
    }

    // If you are calling a function again and again, you can treat it as a
    // separate call in the stack
}
