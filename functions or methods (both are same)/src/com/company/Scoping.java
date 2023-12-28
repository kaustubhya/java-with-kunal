package com.company;

public class Scoping {
    public static void main(String[] args) {
//       CASE 1
        int a = 1;
//        Initialization possible
        {
            a = 10;
//            updation possible
//            int a  = 145;           reinitialization not possible
            System.out.println(a);
//            possible
        }
        System.out.println(a);
//        possible

//        CASE 2
        {
            String name = "Yash";
//            initialization possible
            System.out.println(name);
        }
//        name = "Babar"; updation not possible
        String name = "Kunal";
//        reinitialisation possible
        System.out.println(name);
    }
}
