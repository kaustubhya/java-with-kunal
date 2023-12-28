package com.company;

public class Question7_SearchInMountain {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = searchIndexInMountain(array, target);
        System.out.println(ans);

    }

    static int searchIndexInMountain(int arr [], int target) {
        int peak = peakInMountainArray(arr);
        int goingToTheAscendingOrderArrayFirst =
                orderAgnosticBinarySearch(arr, target, 0, peak);

        if (goingToTheAscendingOrderArrayFirst != -1) {
            return goingToTheAscendingOrderArrayFirst;
        }
//        trying to search in the descending part (second part) of the array

        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        // in case if we do not get the target in the first part, we return it
        // from the second part because we know that it is definitely there

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


    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        // Here we are putting start and end inside the method brackets as we want
        // to set the values of start and end ourselves later and
        // not set it from 0 to arr.length - 1;


        // find if the array is sorted in ascending or descending
        boolean isAscending;

        if(arr[start] < arr[end]){
            isAscending = true;
        }
        else{
            isAscending = false;
        }

        while(start <= end){
            // find the middle element
            // middle = (start - end) / 2 might give us an error, hence use the following:-
            int middle = start + (end- start) / 2;


            if(arr[middle] == target){     // 3 cases ascending, descending, equal
                return middle;
                // we have found the answer
            }

            if(isAscending){           // if the case is true
                if(target > arr[middle]){
                    start = middle + 1;          // arr[middle] means the element at the middle
                }                            // ascending case
                else{
                    end = middle - 1;
                }
            }
            else{
                if(target < arr[middle]){             // descending case
                    start = middle + 1;          // arr[middle] means the element at the middle
                }
                else{
                    end = middle - 1;
                }
            }
        }

        return -1;
    }
}
