package RegEx.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Exr_03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //%George%<Croissant>|2|10.3$
        //%Peter%<Gum>|1|1.3$
        //%Maria%<Cola>|1|2.4$
        //end of shift

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile
                ("%(?<name>[A-Z][a-z]+)%[^%$|.]*<(?<item>\\w+)>[^%$|.]*\\|(?<qty>\\d+)" +
                        "\\|(?<price>\\d+\\.?\\d+?)\\$");
        double sum = 0.;

        while (!"end of shift".equals(input)){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println(String.format("%s: %s - %.2f",
                        matcher.group("name"),
                        matcher.group("item"),
                        Integer.parseInt(matcher.group("qty")) * Double.parseDouble(matcher.group("price"))));
                sum += Integer.parseInt(matcher.group("qty")) *
                        Double.parseDouble(matcher.group("price"));
            }

            input = scanner.nextLine();
        }

        System.out.println(String.format("Total income: %.2f", sum));
    }
}