package com.company;

public class Pattern_5_5 {
    public static void main(String[] args) {
        patterns(5);
    }

    static void patterns(int n){
        for(int row = 0; row < 2 * n; row++) {
            int totalColumnsInRow;
            if (row > n) {
                totalColumnsInRow = 2 * n - row;
                // lower half case
            } else {
                totalColumnsInRow = row;
                // normal case
            }
            for (int columns = 0; columns < totalColumnsInRow; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
