package com.company;

public class Pattern_8_17 {
    public static void main(String[] args) {
        patterns(4);

    }

    static void patterns(int n){
        for (int row = 1; row <= 2 * n; row++){
            // for numbers start loop from 1


            int totalColumnsInRow;

            if (row > n ){
                totalColumnsInRow = 2 * n - row;
            }
            else{
                totalColumnsInRow = row;
            }


           int noOfSpaces = n - totalColumnsInRow;

            for(int spaces = 0; spaces < noOfSpaces; spaces++){
                System.out.print("  ");
                // keep in mind, the spaces come first then the columns come after it
            }
            for(int columns = totalColumnsInRow; columns >= 1; columns-- ){
                System.out.print(columns + " ");
            }
            for(int columns = 2; columns <= totalColumnsInRow; columns ++){
                System.out.print(columns + " ");
            }


            System.out.println();
        }
    }
}
