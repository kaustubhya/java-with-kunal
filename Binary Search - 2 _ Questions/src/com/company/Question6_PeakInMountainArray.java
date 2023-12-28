package com.company;

public class Question6_PeakInMountainArray {
    public static void main(String[] args) {

        int [] array = {0,1,3,5,6,4,3,2};
        int ans = peakInMountainArray(array);
        System.out.println(ans);

    }
    static int peakInMountainArray (int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            // here in the while loop, start is not equal to end, because if it did, the loop
            // would not have been broken and we would not have gotten any output
            int middle = start  + (end - start) / 2;

             if(arr [middle] > arr[middle + 1]){
                 // you are in the decreasing part of the array
                 // this may be the answer but look at left
                 // this is why end != ( is not equal to) middle - 1;

                 end = middle;
             }

             else{
                 // you are in the ascending part of the array
                 start = middle + 1;
                 // because we know that middle + 1 element > middle element
             }
        }

        // in the end, start and end will be equal and pointing to the largest number
//        because of the 2 checks above
        /* start and end are always trying to find the maximum element in the above two checks
        hence when they are pointing to just 1 element, that is the max one because that is what
        the checks say
         */

        /* More elaboration:- At every point of time for start and end, they have the best
        possible answer till that time and if we are saying that only one item is
         remaining, hence because of the above line, that is the best possible answer */

        return start; // or we can return end too as both of them are equal
    }
}
