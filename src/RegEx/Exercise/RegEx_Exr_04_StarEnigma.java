package RegEx.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Exr_04_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2
        //STCDoghudd4=63333$D$0A53333
        //EHfsytsnhf?8555&I&2C9555SR

        int n = Integer.parseInt(scanner.nextLine());
        List<String> A = new ArrayList<>();
        List<String> D = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine(); //STCDoghudd4=63333$D$0A53333
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'S' | input.charAt(j) == 'T' | input.charAt(j) == 'A' | input.charAt(j) == 'R'
                        | input.charAt(j) == 's' | input.charAt(j) == 't' | input.charAt(j) == 'a' | input.charAt(j) == 'r') {
                    count++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                sb.append((char) (input.charAt(j) - count));
            }
            Pattern pattern = Pattern.compile("[^@\\-!:>]*@[^@\\-!:>]*([A-Z][a-z]+)[^@\\-!:>]*:" +
                    "[^@\\-!:>]*\\d+[^@\\-!:>]*![^@\\-!:>]*([A-Z])[^@\\-!:>]*!->[^@\\-!" +
                    ":>]*\\d+[^@\\-!:>]*");
            Matcher matcher = pattern.matcher(sb);

            if (matcher.find()) {
                if ("A".equals(matcher.group(2))) {
                    A.add(matcher.group(1));
                } else if ("D".equals(matcher.group(2))) {
                    D.add(matcher.group(1));
                }
            }
        }
        System.out.println(String.format("Attacked planets: %d", A.size()));
        A
                .stream()
                .sorted(String::compareTo)
                .forEach(a -> System.out.printf("-> %s%n", a));
        System.out.println(String.format("Destroyed planets: %d", D.size()));
        D
                .stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(d -> System.out.printf("-> %s%n", d));
    }
}