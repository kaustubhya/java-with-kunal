package com.company;

public class Question10_RotationCount {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,0,1};
        int ans = countRotations(array);
        System.out.println(ans);

        int [] array2 = {2,9,2,2,2};
        int ans2 = countRotationDuplicates(array2);

        System.out.println(ans2);

    }

    static int countRotations(int [] arr){
        int pivot =  findPivot(arr);
        return pivot + 1;
    }

    static int countRotationDuplicates(int[] arr){
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }


    // here if pivot = -1; then the methods
    // return 0, i.e. the array did not rotate and is a sorted array

    // use this method if you do not have duplicate elements

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


    // use this method if you have duplicate elements
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
}
