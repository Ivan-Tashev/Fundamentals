package FinalExam.FinalExam3Aug19Group1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_3Aug19Group1_02_MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^([$%])([A-Z][a-z][a-z]+)\\1: \\[(\\d+)]\\|\\[(\\d+)]\\|\\[(\\d+)]\\|$");
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                System.out.printf("%s: %c%c%c%n",
                        matcher.group(2),
                        (char) Integer.parseInt(matcher.group(3)),
                        (char) Integer.parseInt(matcher.group(4)),
                        (char) Integer.parseInt(matcher.group(5)));
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}