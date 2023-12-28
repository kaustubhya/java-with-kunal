package com.company;

public class MaxWealth {
    public static void main(String[] args) {
    int [] [] nums = {{1,2,3},
            {4,5,8},
            {7,9,2}
    };
    int ans = maxWealth(nums);
        System.out.println(ans);
    }

    static int maxWealth(int [] [] accounts){

        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++){
            // when you start a new column, take a new sum for that row

            int sum = 0;

            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];

            }

            // now we have a sum of accounts of a person

            // checking with overall answer

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
