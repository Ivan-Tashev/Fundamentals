package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isInt = false;
        boolean isDouble = false;

        while (!input.equals("END")) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '.') {
                    isDouble = true;
                }
            }
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    isInt = true;
                } else {
                    isInt = false;
                    break;
                }
            }
            if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
                isDouble = false;
            } else if ((input.equals("true")) || input.equals("false")) {
                System.out.printf("%b is boolean type%n", input);
            } else if (input.length() == 1) {
                if (input.charAt(0) > 47 && input.charAt(0) < 58)
                    System.out.printf("%s is integer type%n", input);
                else System.out.printf("%c is character type%n", input.charAt(0));
            } else if (input.charAt(0) == '-') {
                System.out.printf("%s is integer type%n", input);
            } else if (isInt) {
                System.out.printf("%s is integer type%n", input);
                isInt = false;
            } else System.out.printf("%s is string type%n", input);
            input = scanner.nextLine();
        }
    }
}

