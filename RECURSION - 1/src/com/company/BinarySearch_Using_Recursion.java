package com.company;

public class BinarySearch_Using_Recursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,66,78};
        int target = 1;
        System.out.println(search(array, target, 0, array.length-1));


    }

    static int search(int[] arr, int target, int start, int end){

        if (start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr, target, start, mid - 1 );
        }

        return search(arr, target, mid + 1, end);
    }
}
