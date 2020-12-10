package Methods.Exercise;

import javax.swing.*;
import java.util.Scanner;

public class Methods_Exr_04_PasswordValidator {

    public static boolean characters6to10(String input) {
        boolean char6to10 = false;
        if (input.length() < 6 || input.length() > 10) {
            char6to10 = true;
        }
        return char6to10;
    }

    public static boolean letterAndDigits(String input) {
        boolean letterDigit = false;
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 48 && input.charAt(i) <= 57) ||
                    (input.charAt(i) >= 65 && input.charAt(i) <= 90) ||
                    (input.charAt(i) >= 97 && input.charAt(i) <= 122)) {
            } else {
                letterDigit = true;
                break;
            }
        }
        return letterDigit;
    }

    public static boolean twoDigits(String input) {
        boolean digits = false;
        int digitsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) digitsCount++;
        }
        if (digitsCount < 2) {
            digits = true;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (characters6to10(pass))
        System.out.println("Password must be between 6 and 10 characters");
        if (letterAndDigits(pass))
        System.out.println("Password must consist only of letters and digits");
        if (twoDigits(pass))
        System.out.println("Password must have at least 2 digits");
        if (characters6to10(pass) || letterAndDigits(pass) || twoDigits(pass)) {
        } else System.out.println("Password is valid");
    }
}