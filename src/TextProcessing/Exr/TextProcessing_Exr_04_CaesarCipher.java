package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Programming is cool!

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append((char) (input.charAt(i) + 3));
        }
        System.out.println(result);
    }
}
