package com.company;

import java.util.Arrays;

public class Question1_RowAndColumnSortedMatrix {
    public static void main(String[] args) {

        int [] [] matrix2D = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,39},
                {33,34,38,50}
        };

        int target = 37;
        int[] ans =search(matrix2D,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int [][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0 ){
            if(matrix [row] [column] == target){
                return new int [] {row, column};

            }

            else if(matrix [row] [column] > target){
                column--;
            }

            else{
                row++;
            }
        }

        return new int [] {-1, -1};

        // target is not inside the matrix

    }
}
