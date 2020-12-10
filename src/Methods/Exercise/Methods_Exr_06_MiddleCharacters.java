package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_06_MiddleCharacters {

    public static void middleChar(String input) {
        if (input.length() % 2 == 1) { // odd -> single char
            System.out.println(input.charAt(input.length() / 2));
        } else { // even -> two chars
            System.out.println(input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleChar(input);
    }
}
