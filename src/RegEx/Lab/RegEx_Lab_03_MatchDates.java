package RegEx.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Lab_03_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(
                "(?<day>\\d\\d)(\\W)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()) {

            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    matcher.group("day"),
                    matcher.group("month"),
                    matcher.group("year")
            );
        }
    }
}