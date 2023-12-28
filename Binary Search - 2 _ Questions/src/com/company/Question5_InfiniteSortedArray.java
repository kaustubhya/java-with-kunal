package com.company;

public class Question5_InfiniteSortedArray {
    public static void main(String[] args) {
    int [] array = {3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
    int ans = startAndEndShifting(array,target);
    System.out.println(ans);


    }

    static int startAndEndShifting(int [] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;  // this is the new start

            // now we have to double the box value and find the new end
//            for finding this, use the formula: newEnd = previousEnd (end here) + sizeOfBox * 2
//            size of box = (end - start + 1), since we were taking the indices of end and start
//            here, which was 1 less than their actual positions (array numbering), so to find
//            the box size from indices, we added 1

            int newEnd = end + (end - start + 1) * 2 ;

            start = newStart;
            end = newEnd;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int [] arr, int target, int start, int end){
        // return the index no.
        // return -1, if the target does not exist
        // Since this is an infinite array, we do not write start and end here,
        // hence we write it inside the method


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
