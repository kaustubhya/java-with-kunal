package com.company;

public class Question3_NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','g','k','p','q','x','y'};
        char target = 'z';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char [] letters, char target){
        // similar to ceiling


        int start = 0;
        int end = letters.length - 1;
        // here these are index numbers


        while(start <= end) {
            // find the middle element
            // middle = (start - end) / 2 might give us an error, hence use the following:-
            int middle = start + (end - start) / 2;

            if (target > letters[middle]) {
                start = middle + 1;          // arr[middle] means the element at the middle
            } else {
                end = middle - 1;
            }

        }

        return letters[start % letters.length];
        // ceiling found
//        Here the start index is divided by the
//        array length and we get the letter at that particular index.
        // Here wrap case is used; we are returning the letter which is at zeroth index if
//        by chance the target element exceeds the last element of the array
//        Else we are returning the letter which is the next greatest letter to the target letter

//        Also there is no == condition for this question, only greater than condition is used
//        greater than target letter

    }
}
