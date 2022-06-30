package me.king_jango_13.learn_java;

/*
In the majority of modern programming languages, including Java, parameters are passed to a function by value, rather
than by pointer or reference.

By value:       A local copy of the object is made for the function to use
By pointer:     The address of the variable passed to the function is used
By reference:   The variable passed is being accessed directly

Because methods in Java are all pass by value, if you reassign a value in a function, it does not affect it at all
outside of the function. However, you can modify properties of the object passed in.
*/

import java.util.List;

@SuppressWarnings("unused")
public class PassByValueExample {
    // num will stay the same after the function exits
    public static void square(int num){
        num *= num;
    }

    // lst will have an added 13 after the function exits
    public static void insert13(List<Integer> lst){
        lst.add(13);
    }
}
