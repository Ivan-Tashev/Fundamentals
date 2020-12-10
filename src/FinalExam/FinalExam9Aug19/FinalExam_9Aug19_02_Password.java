package FinalExam.FinalExam9Aug19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_9Aug19_02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //##>00|no|NO|!!!?<###
        //##>123|yes|YES|!!!<##
        //$$<111|noo|NOPE|<<>$$

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([\\S])>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|(.{3})<\\1");
        for (int i = 0; i < n; i++) {
            String pass = scanner.nextLine();
            Matcher matcher = pattern.matcher(pass);
            if (matcher.find()){
                pass = matcher.group(2) + matcher.group(3) + matcher.group(4) + matcher.group(5);
                System.out.println(String.format("Password: %s", pass));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}