package RegEx.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Exr_06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern regex = Pattern.compile("\\b[a-z\\-0-9]+\\.?\\w+?@([a-z-]+)\\.[a-z]+\\.?[a-z]+");
        Matcher match = regex.matcher(input);

        while (match.find()){
            System.out.println(match.group());
        }
    }
}