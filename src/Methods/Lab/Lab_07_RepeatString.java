package Methods.Lab;

import java.util.Scanner;

public class Lab_07_RepeatString {

    public static String repeatStrings (String text, int timesToRepeat) {
        String result = "";
        for (int i = 0; i < timesToRepeat ; i++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        repeatStrings(input,n);
    }
}
