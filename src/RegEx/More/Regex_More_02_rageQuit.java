package RegEx.More;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_More_02_rageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a3
        //aSd2&5s@1

        String input = scanner.nextLine();
        Pattern regex = Pattern.compile("(?<string>\\D+)(?<repeat>\\d\\d?)");
        Matcher match = regex.matcher(input);

        StringBuilder sb = new StringBuilder();

        while (match.find()){
            String st = match.group("string");
            int repeat = Integer.parseInt(match.group("repeat"));
            for (int i = 0; i < repeat; i++) {
                sb.append(st.toUpperCase());
            }
        }

        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            if (!chars.contains(sb.charAt(i))){
                chars.add(sb.charAt(i));
            }
        }
        System.out.println(String.format("Unique symbols used: %d", chars.size()));
        System.out.println(sb);
    }
}