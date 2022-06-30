package me.king_jango_13.learn_java;

@SuppressWarnings("unused")
public class ArrayHelper {
    @SafeVarargs
    public static <T> T[] makeArray(T... items){
        return items;
    }
}
