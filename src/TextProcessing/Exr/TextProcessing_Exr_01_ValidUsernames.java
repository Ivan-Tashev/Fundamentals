package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // sh, too_long_username, !lleg@l ch@rs, jeffbutt

        String[] passes = scanner.nextLine().split(", ");

        for (int i = 0; i < passes.length; i++) {
            boolean isValid = true;

            for (int j = 0; j < passes[i].length(); j++) {
                if (!Character.isLetter(passes[i].charAt(j)) &&
                        !Character.isDigit(passes[i].charAt(j)) &&
                        passes[i].charAt(j) != '-' &&
                        passes[i].charAt(j) != '_') {
                    isValid = false;
                    break;
                }
            }

            if (isValid && passes[i].length() >= 3 && passes[i].length() <= 16)
                System.out.println(passes[i]);
        }
    }
}
