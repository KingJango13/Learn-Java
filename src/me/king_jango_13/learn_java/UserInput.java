package me.king_jango_13.learn_java;

import java.util.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class UserInput {
    /**
     * Get user input from the command line
     *
     * @return The user-inputted String
     */
    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    /**
     * Show a window for a user to type in text
     *
     * @param message Any object will work, as the toString() method on it is called
     * @param title The title of the window
     * @return The user-inputted String
     */
    public static String showInputBox(Object message, String title){
        return JOptionPane.showInputDialog(null,message,title,JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Show a window with a dropdown menu for the user to pick an item from
     *
     * @param message The prompt for the input
     * @param title The title of the window
     * @param img The image for the window
     * @param defaultValue The value that returns if the user doesn't pick anything
     * @param options The different options for the user to select from
     * @return The user selected value or the default value
     */
    public static Object showSelectionMenu(Object message, String title, Icon img, Object defaultValue, Object... options){
        return JOptionPane.showInputDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE,img, options, defaultValue);
    }

    /**
     * Show a window with a dropdown menu for the user to pick an item from
     *
     * @param message The prompt for the input
     * @param title The title of the window
     * @param defaultValue The value that returns if the user doesn't pick anything
     * @param options The different options for the user to select from
     * @return The user selected value or the default value
     */
    public static Object showSelectionMenu(Object message, String title, Object defaultValue, Object... options){
        return showSelectionMenu(message, title, null, defaultValue, options);
    }

    public static void showAlert(Object message, String title){
        JOptionPane.showMessageDialog(null,message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarning(Object message, String title){
        JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);
    }
}
