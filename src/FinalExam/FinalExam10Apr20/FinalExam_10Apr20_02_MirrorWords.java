package FinalExam.FinalExam10Apr20;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_10Apr20_02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //@mix#tix3dj#poOl##loOp#wl@@bong&song%4very$long@thong#Part##traP##@@leveL@@Level@##
        // car#rac##tu@pack@@ckap@#rr#sAw##wAs#r#@w1r

        String input = scanner.nextLine();
        List<String> res = new ArrayList<>();

        Pattern pattern = Pattern.compile("([@#])(?<first>[A-Za-z]{3,})(\\1)(\\1)(?<second>[aA-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            res.add(matcher.group());
        }

        if (res.isEmpty()) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", res.size());

            Pattern regex = Pattern.compile("[#@]([A-Za-z]+)[#@][#@]([A-Za-z]+)[#@]");

            for (int i = 0; i < res.size(); i++) {

                Matcher matcher1 = regex.matcher(res.get(i));
                matcher1.find();

                String first = matcher1.group(1);
                String second = matcher1.group(2);
                StringBuilder sb = new StringBuilder(second);
                sb = sb.reverse();

                if (first.equals(sb.toString())) {
                    res.set(i, first + " <=> " + second);
                } else {
                    res.remove(i);
                    i--;
                }
            }

            if (!res.isEmpty()) {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", res));
                ;
            } else {
                System.out.println("No mirror words!");
            }
        }
    }
}