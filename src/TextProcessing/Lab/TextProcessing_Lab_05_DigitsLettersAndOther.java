package TextProcessing.Lab;

import java.util.Date;
import java.util.Scanner;

public class TextProcessing_Lab_05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Agd#53Dfg^&4F53

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char cur = text.charAt(i);
            if (Character.isDigit(cur)) {
                digits.append(cur);
            } else if (Character.isLetter(cur)) {
                letters.append(cur);
            } else {
                symbols.append(cur);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}