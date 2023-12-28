package com.company;

import java.util.Arrays;

public class Question2_CompletelySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int target = 6;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

//    Search in the row provided between the columns provided

    static int[] binarySearch(int [][] matrix, int row, int columnStart, int columnEnd, int target){
        while(columnStart <= columnEnd){
            int middle = columnStart + (columnEnd - columnStart)/2;
            if(matrix [row] [middle] ==  target){
                return new int [] {row, middle};
            }
            else if(matrix [row] [middle] < target){
                columnStart = middle + 1;
            }

            else{
                columnEnd = middle - 1;
            }
        }

        return new int [] {-1,-1};
        // target not found
    }

    static int[] search(int [][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        // be cautious, matrix may be empty


        if(rows == 1) {
            return binarySearch(matrix, 0, 0, columns - 1,target);
            // if there is only 1 row
        }

        // run the loop until only 2 rows are remaining

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnMid = columns / 2;

        while(rowStart < (rowEnd - 1)){
//            while this is true, it will have more than 2 rows which we are trying to eliminate
         int middle2 = rowStart + (rowEnd - rowStart)/2;

         if(matrix[middle2][columnMid] == target){
            return new int [] {middle2, columnMid};
         }
         else if(matrix[middle2] [columnMid] > target){
            rowEnd = middle2;
            // Eliminating lower rows
         }
         else{
            rowStart = middle2;
//            Eliminating upper rows
         }

        }
//        mow we have two rows
//        check whether the target is in the column of the two rows

        if(matrix[rowStart][columnMid] == target){
            return new int[] {rowStart, columnMid};
        }

        if(matrix[rowStart + 1][columnMid] == target) {
            return new int[]{rowStart + 1, columnMid};
        }
//            Here rowEnd is modified into rowStart + 1 since there are only two rows

//            if the target is not found here then,
            // Search in 1st Half
            if (target <= matrix[rowStart][columnMid - 1]) {
                return binarySearch(matrix, rowStart, 0, columnMid - 1, target);
            }
//            Search in 2nd Half
            if ((target >= matrix[rowStart][columnMid + 1]) && (target <= matrix[rowStart][columns -1])) {
                return binarySearch(matrix, rowStart, columnMid + 1, columns - 1, target);
            }
//            Search in 3rd half
                if (target <= matrix[rowStart + 1][columnMid - 1]) {
                    return binarySearch(matrix, rowStart + 1, 0, columnMid - 1, target);
                }
//            Search in 4th half
                    else {
                        return binarySearch(matrix, rowStart + 1, columnMid + 1, columns - 1, target);
                    }

                    // no need to put return statements here, binary search will take care of everything
    }

}

