package FinalExam.FinalExam7Dec19Group2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_7Dec19Group2_02_MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2
        //!Send!:[IvanisHere]
        //*Time@:[Itis5amAlready]

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("!([A-Z][a-z]{2,})!:\\[([A-Za-z]{8,})]");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.printf("%s: ", matcher.group(1));
                char[] charArray = matcher.group(2).toCharArray();
                for (int i1 = 0; i1 < charArray.length - 1; i1++) {
                    char c = charArray[i1];
                    System.out.print((int) c + " ");
                }
                System.out.println((int)(charArray[charArray.length - 1]));
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}