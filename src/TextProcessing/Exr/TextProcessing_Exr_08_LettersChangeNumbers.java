package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A12b s17G

        String[] words = scanner.nextLine().split("\\s+");
        double sum = 0.;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            long num = Long.parseLong(word.substring(1, word.length() - 1));

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);

            if (Character.isUpperCase(firstLetter)) { // Upper case
                sum += (num * 1. / (firstLetter - 64));
            } else if (Character.isLowerCase(firstLetter)) { // Lower case
                sum += (num * (firstLetter - 96));
            }

            if (Character.isUpperCase(lastLetter)) { // Upper case
                sum -= (lastLetter - 64);
            } else if (Character.isLowerCase(lastLetter)) { // Lower case
                sum += (lastLetter - 96);
            }
        }
        System.out.printf("%.2f", sum);
    }
}
