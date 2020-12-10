package TextProcessing.Lab;

import java.util.Scanner;

public class TextProcessing_Lab_04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ban = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < ban.length; i++) {
            StringBuilder replacement = new StringBuilder();
            for (int j = 0; j < ban[i].length(); j++) {
                replacement.append("*");
            }

            while (text.contains(ban[i])){
                text = text.replaceAll(ban[i], String.valueOf(replacement.toString()));
            }
        }
        System.out.println(text);
    }
}