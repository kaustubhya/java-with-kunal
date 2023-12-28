package com.company;

public class Question11_SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] array = {7,2,5,8,10};
        int ans = splitArray(array, 2);
        System.out.println(ans);

    }

    static int splitArray(int[] nums, int m){

        // do look at the running of while loop and for each loop closely, maybe the former talks about
        // the index of the number while the latter talks about the number itself

        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++ ){
            start = Math.max(start, nums[i]);
            // in the end of the loop, this will contain the maximum item from the array
            // using basic linear search to find the maximum item from the given array

            end = end + nums[i] ;
            // we are adding each element of the array to the end,
            // which keeps getting modified and by the end, the end is equal to
            // the sum of the array
        }

        // start = 10 (max element), here m is the largest (equal to the number of elements in the array)
        //end = 32 (sum of the array) here m is the lowest (1)
        // binary search in the array [10  32]    // potential answer is somewhat inside this array therefore binary search is used

        while(start < end){
            // we try to find the middle as potential answer
            // we did not put equal to between start and end because we want start to be equal
//            to end and hence break the loop

            int mid = start + (end - start)/2;


            // calculate how many places you can divide this in with this max sum

            int sum = 0;
            int pieces = 1;  // 1 complete full array = 1 piece

            // using a for each loop
            for(int element : nums){
                if(sum + element > mid){
                    // you can not add this in the subarray hence, make a new one
//                    say you add this element in your sub array, then sum = sum + element
//                    which is not <= mid
                    sum = element;
                    // here if the element's sum is greater than the mid, it then goes into
                    // a new sub array
                    pieces++;
                }
                else{
                    sum = sum + element;
                    // else, if the sum of elements is smaller than the subarray, then the new element
//                    gets added in that sum in that same subarray

                }

            }

            if(pieces > m){
                // it means we have come too left and we need to go a bit right,
                // therefore
                start = mid + 1;
            }else{
                // going left
                end = mid;
                // because we have not put the equal condition here (see while loop)
            }
        }


     return end;
//             here start == end, so we can return either of those

    }
}
