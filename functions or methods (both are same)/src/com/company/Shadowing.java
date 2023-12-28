package com.company;

public class Shadowing {
    static int x = 90;
//    as method is a static method, to match with it we added a static word before int
//    will be shadowed at line 10
public static void main(String[] args) {
    System.out.println(x);
//    output = 90
     int x;
//    the x (class variable) = 90 at line 4 is shadowed by this
//    System.out.println(x); we get an error here as the variable is declared and still not initialized
     x = 40;
//     now it is initialised hence, the shadowing and scoping can now begin
    System.out.println(x);
//    output = 40
    fun();
//    the function fun() is called which brings in its output of x = 90

}
static void fun(){
    System.out.println(x);
//    output is 90 as it is outside main method, so all the tweaking of x does noot apply to it, since
//    x = 90 is outside main method, in the main class, the output will be 90
}


}
