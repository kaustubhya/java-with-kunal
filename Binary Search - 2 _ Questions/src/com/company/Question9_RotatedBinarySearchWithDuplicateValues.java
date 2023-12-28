package com.company;

public class Question9_RotatedBinarySearchWithDuplicateValues {
    public static void main(String[] args) {
        int [] array = {2,9,2,2,2};
        int target = 2;
        int ansIndexOfTarget = searchAnswer(array,target);
        System.out.println(ansIndexOfTarget);

        int pivotAns = findPivotWithDuplicates(array);
        System.out.println(pivotAns);

    }

    static int searchAnswer(int [] nums, int target){
        int pivot = findPivotWithDuplicates(nums);


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

    static int findPivotWithDuplicates(int[] arr){
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

            // HERE THINGS GET MODIFIED FOR DUPLICATE ELEMENTS:-

//            if the elements at middle, start and end are equal, then just skip the duplicates
            if(arr[mid] == arr [start] && arr[mid] == arr[end]){
//
                // here we do this to eliminate the fact that all start, mid and end have
                // the same elements
                //skip the duplicates
//                NOTE:- What if these elements at the start and end were the pivot
                // check if start is pivot
              if(arr[start] > arr[start + 1]){   // checking
                return start;
              }
               start++; // skipping

            // check if end is pivot
                if(arr[end] < arr[end - 1]){
                    // here for end, if the previous element is greater than end,
                    // then the previous element is going to be the pivot
                    return end -1;
                }
                end--;
            }

            // left side is sorted so, pivot should be in the right i.e, after removing of
            // duplicates is done, continue with the normal cases 3 and 4



            else if(arr[start] < arr [mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                //            lhs if correct searches in the right side of mid
//                if rhs (rhs of ||) is correct, searching happens in the left side of mid
                start = mid + 1;
            }
            else{
                end = mid - 1;
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
