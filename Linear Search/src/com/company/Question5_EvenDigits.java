package com.company;

public class Question5_EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,63,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);


        // to find the number of digits in any number
        System.out.println(noOfDigits(31259));
        System.out.println(noOfDigits(-3125956));
        System.out.println(noOfDigits(0));
        System.out.println(noOfDigits2(78451296));
        System.out.println(noOfDigits2(-78));
        System.out.println(noOfDigits2(0));

    }

    // this function finds how many numbers in the array have even digits
    static int findNumbers(int [] arr){
        int count = 0;
//        using a for each loop for this array
        for(int number1 : arr){
            if(even(number1)){
                count++;
            }
        }
        return count;
    }
//  function to check whether a number contains even digits or not
    static boolean even(int numbers){
        int numberOfDigits = noOfDigits(numbers);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;

        // Shortcut - return numberOfDigits % 2 == 0;
    }


    // count number of digits in a number
    static int noOfDigits(int number) {

        // to include negative numbers
        if(number < 0){
            number = number * -1;    // this will make the negative number
            // positive which will be allowed to
//            get into the while loop
        }

        // for 0
        if(number == 0){
            return 1;   // as 0 has 1 digit, which was not displayed by the IDE
        }

        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // ShortCut to find number of digits
    static int noOfDigits2(int number3){

        // to include negative numbers
        if(number3 < 0){
            number3 = number3 * -1;    // this will make the negative number
            // positive which will be allowed to
//            get into the while loop
        }

        // for 0
        if(number3 == 0){
            return 1;   // as 0 has 1 digit, which was not displayed by the IDE
        }
        return (int) (Math.log10(number3)) + 1;
    }
}
