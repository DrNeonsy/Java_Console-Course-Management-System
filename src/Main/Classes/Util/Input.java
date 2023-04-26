package Main.Classes.Util;

import java.util.Scanner;

public class Input {
    // ----------------------------------------
    // Input Length Check From Min Max
    // ----------------------------------------
    public static boolean isLengthInput(String input, int min, int max) {
        return input.length() >= min && input.length() <= max;
    }

    // ----------------------------------------
    // Check whether a string is at least one alphabet char and whitespaces are allowed but it cannot only contain whitespaces
    // ----------------------------------------

    public static boolean isCharInputWithWhitespaces(String input) {
        return input.matches("^[a-zA-Z\\s]*$") && !input.matches("^\\s*$");
    }

    // ----------------------------------------
    // Character Only Input
    // ----------------------------------------
    public static boolean isCharInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // ----------------------------------------
    // Number Only Input
    // ----------------------------------------
    public static boolean isNumInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // ----------------------------------------
    // Character and Number Only Input
    // ----------------------------------------

    public static boolean isCharNumInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i)) && !Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // ----------------------------------------
    // Email Input
    // ----------------------------------------
    public static boolean isEmailInput(String input) {
        return input.matches("^[A-Za-z][A-Za-z0-9_-]*@[A-Za-z]+\\.[A-Za-z]+$");
    }

    // ----------------------------------------
    // Password Input
    // ----------------------------------------
    public static boolean isPasswordInput(String input) {
        return input.length() >= 8
                && input.matches(".*[0-9].*")
                && input.matches(".*[a-z].*")
                && input.matches(".*[A-Z].*");
    }

    // ----------------------------------------
    // Getting Input
    // ----------------------------------------
    public static String getInput(String message, String what) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n%s%n", message);
        System.out.printf("Enter %s: ", what);
        return scanner.nextLine();
    }
}
