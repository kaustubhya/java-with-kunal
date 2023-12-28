package com.company;

public class Question1_SearchInStrings {
    public static void main(String[] args) {
        String entry = "Kaustubhya";
        char target = 'h';
        boolean ans = search(entry, target);
        System.out.println(ans);
        boolean ans2 = search2(entry,target);
        System.out.println(ans2);


    }

    static boolean search(String str, char target){
        if (str.length() == 0){
//            Here String is an Array of chars
//            hence, str.length() is a function
            // str.length is a variable
//            see the difference of parenthesis '()'
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
//                tells the position of the character at a certain place in the string
                return true;
            }
        }
        return false;
    }

    // now using a for each loop

    static boolean search2(String str, char target){
        if (str.length() == 0){
//            Here String is an Array of chars
//            hence, str.length() is a function
            // str.length is a variable
//            see the difference of parenthesis '()'
            return false;
        }

        for(char ch : str.toCharArray()){
//            for using for each loop, we need an array, so here we converted the
//            string str into a char array
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
