package com.company;

public class Pattern_6_28 {

    public static void main(String[] args) {
        patterns(5);

    }

    static void patterns(int n){
        for(int row = 0; row < 2 * n; row++){

            int totalColumnsInRow;

            if (row > n ){
                totalColumnsInRow = 2 * n - row;
            }
            else{
                totalColumnsInRow = row;
            }


//            here a space factor also comes into play
            int noOfSpaces = n - totalColumnsInRow;
//                for column = 5, we have 0 spaces
            // column = 4, 1 space;     column = 3, 2 spaces; column = 2, 3 spaces; column = 1, 4 spaces
            // (see figure)
            for(int spaces = 0; spaces < noOfSpaces; spaces++){
                System.out.print(" ");
            }
//            printing the stars now

            for(int columns = 0; columns < totalColumnsInRow; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
