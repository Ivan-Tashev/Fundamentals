package FinalExam.FinalExam7Dec19Group1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_7Dec19Group1_02_Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //U$MichaelU$P@$asdqwe123P@$
        //U$NameU$P@$PasswordP@$
        //U$UserU$P@$ad2P@$

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String registration = scanner.nextLine();
            Pattern pattern = Pattern.compile("U\\$([A-Z][a-z]{2,})U\\$P@\\$([A-Za-z]{5,}\\d+)P@\\$");
            Matcher matcher = pattern.matcher(registration);

            if (matcher.find()){
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s",
                        matcher.group(1), matcher.group(2)));
                count++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d", count);
    }
}