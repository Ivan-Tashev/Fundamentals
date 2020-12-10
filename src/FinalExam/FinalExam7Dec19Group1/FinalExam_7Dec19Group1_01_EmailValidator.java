package FinalExam.FinalExam7Dec19Group1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_7Dec19Group1_01_EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mike123@somemail.com
        //Make Upper
        //GetDomain 3
        //GetUsername
        //Encrypt
        //Complete

        String email = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"Complete".equals(input)) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Make":
                    if ("Upper".equals(command[1])) {
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else if ("Lower".equals(command[1])) {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(command[1]);
                    if (email.length() >= count) {
                        System.out.println(email.substring(email.length() - count));
                    }
                    break;
                case "GetUsername":
                    Pattern pattern = Pattern.compile("(\\w.+)@");
                    Matcher matcher = pattern.matcher(email);
                    if (matcher.find()){
                        System.out.println(matcher.group(1));
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                    }
                    break;
                case "Replace":
                    char symbol = command[1].charAt(0);
                    email = email.replaceAll(String.valueOf(symbol),"-");
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length() - 1; i++) {
                        int res = email.charAt(i);
                        System.out.print(res + " ");
                    }
                    System.out.println((int)email.charAt(email.length() - 1));
                    break;
            }
            input = scanner.nextLine();
        }
    }
}