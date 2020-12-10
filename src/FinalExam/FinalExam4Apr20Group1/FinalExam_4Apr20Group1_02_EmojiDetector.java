package FinalExam.FinalExam4Apr20Group1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_4Apr20Group1_02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //In the Sofia Zoo there are 311 animals in total! ::Smiley:: This includes 3 **Tigers**,
        // 1 ::Elephant:, 12 **Monk3ys**, a **Gorilla::, 5 ::fox:es: and 21 different types of
        // :Snak::Es::. ::Mooning:: **Shy**

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        BigInteger threshold = BigInteger.valueOf(1);
        while (matcher.find()) {
            threshold = threshold.multiply(BigInteger.valueOf(Integer.parseInt(matcher.group())));
        }
        System.out.printf("Cool threshold: %d%n", threshold);

        Pattern regex = Pattern.compile("(?<symbols>[:*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)");
        Matcher matcher1 = regex.matcher(input);
        int count = 0;
        List<String> result = new ArrayList<>();
        while (matcher1.find()) {
            count++;
            int coolness = 0;
            for (int i = 0; i < matcher1.group().length(); i++) {
                coolness += matcher1.group().charAt(i);
            }
            BigInteger cool = new BigInteger(String.valueOf(coolness));
            if (cool.compareTo(threshold) > 0) {
                String res = matcher1.group("symbols") + matcher1.group("emoji") + matcher1.group("symbols");
                result.add(res);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        if (result.isEmpty()) return;
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.println(result.get(i));
        }
        System.out.print(result.get(result.size() - 1));
    }
}