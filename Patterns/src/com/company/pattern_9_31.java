package com.company;

public class pattern_9_31 {
    public static void main(String[] args) {
        patterns(4);

    }

    static void patterns(int n){
        int originalN = n;
        n = 2 * n  - 2;
        for(int row = 0; row <= n; row++){
            for(int column = 0; column <= n; column++){
                int atEveryIndex = originalN - Math.min(Math.min(row,column), Math.min(n - row,  n - column));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
