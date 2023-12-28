package com.company;

public class Pattern_4_4 {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
                // give a space for neatness
            }
            System.out.println();
        }
    }
}
