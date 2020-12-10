package FinalExam.FinalExam13Dec19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_13Dec19_02_BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //|GEORGI|:#Lead architect#
        //|Hristo|:#High Overseer#
        //|STEFAN|:#Assistant Game Developer#

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\|([A-Z]{4,})\\|:#([A-Za-z]+ [A-Za-z]+)#");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group(1);
                String title = matcher.group(2);
                System.out.println(String.format("%s, The %s", name, title));
                System.out.println(String.format(">> Strength: %d", name.length()));
                System.out.println(String.format(">> Armour: %d", title.length()));
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}