package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        int [] array = {5,4,3,-2,1,0};
        bubble(array);
        // here we have not returned anything. Hence, no special int ans required
        System.out.println(Arrays.toString(array));

    }

    static void bubble(int [] arr){
        boolean isSwappingNeeded;
        // run the steps N-1 times;
        // N = arr.length
        for(int i = 0; i < arr.length; i++){
            isSwappingNeeded = false;

            // for each step, the max item will come at the last respective index
            for(int j = 1; j < arr.length - i; j++){
                // j = 1 here
                // swap if the current item is smaller than the previous item

                if(arr[j] < arr[j - 1]){
                    // swap here
                    int temp = arr[j];
                    arr [j] = arr [j-1];
                    arr[j-1] = temp;
                    isSwappingNeeded = true;

                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted
            // fully, hence stop the program

            if(!isSwappingNeeded){   // here if swapping does not occur then we need to get out of the loop
                // to get out isSwappingNeeded should be false. If we write this in an if statement
//                we have to convert !isSwappingNeeded into true and that is what we have done here
                break;
            }

        }
    }
}
