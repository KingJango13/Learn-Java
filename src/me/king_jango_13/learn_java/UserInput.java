package me.king_jango_13.learn_java;

import java.io.InputStream;
import java.util.*;

@SuppressWarnings("unused")
public class UserInput {
    public static String inputString(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }
    public static String inputString(){
        return inputString(System.in);
    }
}
