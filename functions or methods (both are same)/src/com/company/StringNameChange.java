package com.company;

public class StringNameChange {
    public static void main(String[] args) {
        String name = "Kunal";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "KSD";
    }
}
// Here the value of name didn't change as both name and naam initially were pointing
// to the same object, since naam created a new object value on line 11, it did not affect
// the name whose value was the same when it was printed.
