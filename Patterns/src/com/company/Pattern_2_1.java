package com.company;

public class Pattern_2_1 {
    public static void main(String[] args) {
        patterns(5);
    }

    static void patterns(int n){

            for(int row = 1; row <= n; row++ ){
                for(int column = 1; column <= n; column++){
                    System.out.print("*");
                    // Watch out
                }
                System.out.println();
            }

    }
}
