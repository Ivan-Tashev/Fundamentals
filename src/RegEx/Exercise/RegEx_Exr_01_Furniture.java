package RegEx.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Exr_01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //>>Sofa<<312.23!3
        //>>TV<<300!5
        //>Invalid<<!5
        //Purchase

        String input = scanner.nextLine();
        double sum = 0.;
        List<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile(">>\\w+<<(?<price>\\d+\\.?\\d+)!(?<qty>\\d+)");

        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                result.add(input.substring(2, input.indexOf("<")));
                sum += Double.parseDouble(matcher.group("price"))
                        * Double.parseDouble(matcher.group("qty"));
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}