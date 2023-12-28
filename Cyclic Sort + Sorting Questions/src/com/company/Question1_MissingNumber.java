package com.company;

public class Question1_MissingNumber {

    // Amazon Question

    public static void main(String[] args) {
        int [] array = {4,0,2,1};
        int ans = missingNumber(array);
        System.out.println(ans);

    }

    static int missingNumber(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                // the second part of the if case means that the element is not equal to (not present under)  it's own
//                index, if that's true then only swap
                swap(arr,i, correctIndex);
                // it swaps the element at index no. i, with the element at its respective index position
//                eg. it swaps 3 and the element at the index number 3, from the  array {0,3,1,2};
//                arr[arr[i]] = Element at the original index of the respective element which is at some other index i because the array is unsorted, see the array above;
//                therefore, arr[correctIndex] gives us the element at that  index number and not the index no.
//                but correctIndex gives us the index of the element at i, which wants to go to correctIndex
//             hence, if we see the array [ 4, 2, 0, 1]
//                arr[i], when i = 1 is 2.
//                    correctIndex (of 2) = arr[1] i.e. index no. 2
//                now, arr[arr[i]] and arr[correctIndex] is same which is the element at index no. 2, i.e. 0
//               hence we swap arr[i] and arr[correctIndex] i.e. 2 and 0 to bring 2 to index no. 2

            }

            else{
                i++;
            }
        }

        // Search for the first missing number
        for(int index = 0; index < arr.length; index ++){
            if(arr[index] != index){
                return index;
            }
        }

        // Case 2:-

        return arr.length;

    }

    static void swap(int [] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
