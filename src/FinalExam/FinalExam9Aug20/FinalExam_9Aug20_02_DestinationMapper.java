package FinalExam.FinalExam9Aug20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_9Aug20_02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=

        List<String> destinations = new ArrayList<>();
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([/=])(?<valid>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String current = matcher.group("valid");
            destinations.add(current);
            //    input = input.replaceFirst(current, "");
            //    matcher = pattern.matcher(input);
        }

        int points = 0;
        for (String s : destinations) {
            points += s.length();
        }

        System.out.printf("Destinations: %s%n",
                destinations.toString().replaceAll("[\\[\\]]", ""));
        System.out.printf("Travel Points: %d", points);
    }
}