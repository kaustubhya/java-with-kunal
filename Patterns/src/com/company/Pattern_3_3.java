package com.company;

public class Pattern_3_3 {
    public static void main(String[] args) {
        patterns(5);

    }

    static void patterns(int n){
        for(int row = 1; row <= n; row++){
            // Debug it to understand the concept
            for(int column = 1; column <= (n - row + 1); column ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
