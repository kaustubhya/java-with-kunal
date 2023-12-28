package com.company;

public class Question8_RotatedBinarySearch {
    public static void main(String[] args){

        int [] array = {4,5,6,7,0,1,2};
        int pivotAns = findPivot(array);
        System.out.println(pivotAns);

        int target = 1;
        // for the target index:-
        int targetAns = searchAnswer(array, target);
        System.out.println(targetAns);
    }

    static int searchAnswer(int [] nums, int target){
        int pivot = findPivot(nums);


        // if we could not find the pivot and got -1 from the findPivot method,
        // it means the array is not rotated. In that scenario, use normal binary
        // search

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Now to get the answer from pivot, we perform the 3 cases:-

        // If pivot is found, we have 2 sorted arrays
        if(target == nums[pivot]){
            return pivot;    // returns index of the pivot
        }
        if(target > nums[0]){   // we have specified the starting value here
            return binarySearch(nums, target, 0, pivot - 1);
        }
    // if both conditions are false then target < start
//    hence we return the third case condition statement

     return binarySearch(nums, target, pivot + 1, nums.length - 1);
        // new start and end
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            int mid = start + (end - start)/2;

            // 4 cases of finding pivot over here

            // Case 1
            if(mid < end && arr[mid] > arr[mid + 1] ){
                return mid;
                // we did mid < end because by chance if mid == end,
                // then mid + 1 would have gotten an error of:- " array index out of bounds"
                // so, better to keep it smaller than end
            }

            // Case 2
            if(mid > start && arr[mid] < arr[mid - 1] ){
                return mid - 1;
                // same reason, if mid - 1 is smaller
                // than start, it would have gotten an error, hence, keep the mid always greater than start
            }

            // Case 3

            if(arr[mid] <= arr[start]){
                // put the equals sign here as we do want an output here and the loop to break
                end = mid - 1;
            }

            //  Case 4
            else{
                start = mid + 1;
                // Case 3 and case 4 are if and else conditions, so we go
                // wherever we want, left or right depending on the mid and target
            }
        }

        // if no pivot is found, return -1;

        return -1;

    }

    static int binarySearch(int [] arr, int target, int start, int end){
        // return the index no.
        // return -1, if the target does not exist

        while(start <= end){
            // find the middle element
            // middle = (start - end) / 2 might give us an error, hence use the following:-
            int middle = start + (end- start) / 2;

            if(target > arr[middle]){
                start = middle + 1;          // arr[middle] means the element at the middle
            }
            else if(target < arr[middle]){
                end = middle - 1;
            }else{
                return middle;
                // we have found the answer
            }
        }

        return -1;

    }
}
