package com.company;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89}; // ascending
        int [] nums2 = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18}; // descending
        int target = 22;
        int ans = orderAgnosticBinarySearch(nums,target);
        int ans2 = orderAgnosticBinarySearch(nums2, target);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // here these are index numbers

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

