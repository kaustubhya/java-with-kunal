package com.company;

public class Pattern_7_30 {
    public static void main(String[] args) {
        patterns(5);

    }

    static void patterns(int n){
        for (int row = 1; row <= n; row++){
            // for numbers start loop from 1

            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print("  ");
                // keep in mind, the spaces come first then the columns come after it
            }
            for(int columns = row; columns >= 1; columns-- ){
                System.out.print(columns + " ");
            }
            for(int columns = 2; columns <= row; columns ++){
                System.out.print(columns + " ");
            }


            System.out.println();
        }
    }
}
