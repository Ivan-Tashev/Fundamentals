package RegEx.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Exr_02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //George, Peter, Bill, Tom
        //G4e@55or%6g6!68e!!@
        //R1@!3a$y4456@
        //B5@i@#123ll
        //G@e54o$r6ge#
        //7P%et^#e5346r
        //T$o553m&6
        //end of race

        String[] input = scanner.nextLine().split(", ");
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            racers.put(input[i], 0);
        }

        Pattern letterPattern = Pattern.compile("[A-Za-z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        String line = scanner.nextLine();
        while (!"end of race".equals(line)) {
            Matcher nameMatcher = letterPattern.matcher(line);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }

            if (racers.containsKey(name.toString())) {
                Matcher digitMatcher = digitPattern.matcher(line);
                int sum = 0;
                while (digitMatcher.find()) {
                    sum += Integer.parseInt(digitMatcher.group());
                }
                racers.put(name.toString(), racers.get(name.toString()) + sum);
            }

            line = scanner.nextLine();
        }
        int[] number = {1};
        racers
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(r -> {
                    switch (number[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", r.getKey()));
                            break;
                    }
                    number[0] += 1;
                });
    }
}