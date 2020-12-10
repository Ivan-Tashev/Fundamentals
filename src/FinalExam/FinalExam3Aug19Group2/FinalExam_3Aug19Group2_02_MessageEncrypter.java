package FinalExam.FinalExam3Aug19Group2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_3Aug19Group2_02_MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //*Request*: [I]|[s]|[i]|
        //*Taggy@: [73]|[73]|[73]|
        //Should be valid @Taggy@: [v]|[a]|[l]|

        Pattern pattern = Pattern.compile(
                "([*@])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<first>[A-Za-z])]\\|\\[(?<second>[A-Za-z])]\\|\\[(?<third>[A-Za-z])]\\|$");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.printf("%s: %d %d %d%n",
                        matcher.group("tag"),
                        (int) matcher.group("first").charAt(0),
                        (int) matcher.group("second").charAt(0),
                        (int) matcher.group("third").charAt(0));
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}