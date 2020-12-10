package TextProcessing.Lab;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class TextProcessing_Lab_01_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!"end".equals(input)){
            char[] rev = input.toCharArray();
            System.out.printf("%s = ", input);
            for (int i = rev.length - 1; i >= 0 ; i--) {
                System.out.print(rev[i]);
            }
            System.out.println();
            input = scanner.nextLine();
        }
    }
}