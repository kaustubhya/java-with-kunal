package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

//        Write complete datatype name in the angle brackets
//
//        list.add(123);
//        list.add(456);
//        list.add(7);
//        list.add(7985);
//        list.add(77);
//
//        System.out.println(list);
//        //        here Arrays.toString() is inbuilt, so no need to write those
//        list.contains(7);
//        System.out.println(list.contains(7));
//
//        list.set(1, 0);
//        System.out.println(list);
//        list.remove(4);
//        System.out.println(list);

//        input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

//        get item at any index :- output
//        method 1
        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " ");
//            pass the index here, list[index] syntax will not work here
        }
        System.out.println();

//        method 2
        System.out.println(list);

    }
}
