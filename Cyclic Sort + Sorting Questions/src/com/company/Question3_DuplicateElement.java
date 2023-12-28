package com.company;

public class Question3_DuplicateElement {

    public static void main(String[] args) {

        int [] array = {1,3,4,2,2};
        int ans = findDuplicate(array);
        System.out.println(ans);

    }

    static int findDuplicate(int [] arr){
        int i = 0;
        while(i < arr.length){

            // Here we apply an additional check
            if(arr[i] != i + 1) {
                // this statement checks if an index has an element which is one greater than it.
//                e.g. if index (i) 5 has 5+1 i.e. element no. 6 (arr[i]).
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                    // there's a probability that the first element is a duplicate
                }

            }
            else{
                i++;
            }
        }

        return -1;
        // there are no duplicate elements
    }

    static void swap(int nums[],int first, int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
