package FinalExam.FinalExam24Jul19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_24Jul19_03_TheIsleOfManTTRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //%GiacomoAgostini%=7!!hbqw
        //&GeoffDuke*=6!!vjh]zi
        //JoeyDunlop=10!!lkd,rwazdr
        //Mike??Hailwood=5!![pliu
        //#SteveHislop#=16!!df%TU[Tj(h!!TT[S

        Pattern pattern = Pattern.compile("([#$%*&])(?<name>[A-Za-z]+)\\1=(?<length>\\d+)!!(?<code>.+)$");
        while (true) {
            String racer = scanner.nextLine();
            Matcher matcher = pattern.matcher(racer);
            if (matcher.find() && (Integer.parseInt(matcher.group("length")) ==
                    matcher.group("code").length())) {
                String code = matcher.group("code");
                int length = Integer.parseInt(matcher.group("length"));
                String result = "";
                for (int i = 0; i < code.length(); i++) {
                    result += (char) (code.charAt(i) + length);
                }
                System.out.printf("Coordinates found! %s -> %s", matcher.group("name"),
                        result);
                return;
            } else {
                System.out.println("Nothing found!");
            }
        }
    }
}