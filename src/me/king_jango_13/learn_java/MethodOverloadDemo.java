package me.king_jango_13.learn_java;

/*
In Java, you can have multiple methods with the same name, as long as it has different parameters.
This is possible because when compiled, details of a method such as name, parameter types, and return type
are mixed together to tell the JVM (Java Virtual Machine) that they are different functions.

Method overloading is most commonly used to supplement default parameters (parameters that you can leave out of a
function call). However, you can also find method overloading useful when you want to do different things for different
types.

Because the parameter names are pretty much discarded after compiling, if you have a function that takes (int i), you
can't have a function that takes (int j), because both would be seen by the JVM as func(int) and func(int)
*/

@SuppressWarnings("unused")
public class MethodOverloadDemo {
    /**
     * Get the unknown angle of a triangle
     * @param angleA One angle you know
     * @param angleB The other angle you know
     * @return The unknown angle
     */
    public static int getRemainingTriangleAngle(int angleA, int angleB){
        return 180 - angleA - angleB;
    }

    /**
     * Get the unknown angle of a right triangle
     * @param angle The angle you know that isn't the right angle
     * @return The unknown angle
     */
    public static double getRemainingTriangleAngle(int angle){
        return 90 - angle;
    }
}
