package FinalExam.FinalExam24Jul19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_24Jul19_02_SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Eminem:VENOM
        //Linkin park:NUMB
        //Drake:NONSTOP
        //Adele:HELLO
        //end

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^([A-Z][a-z' ]+):([A-Z ]+)");
        while (!"end".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String encrypt = matcher.group();
                int length = matcher.group(1).length();
                StringBuilder sb = new StringBuilder(); //Eminem:VENOM
                for (int i = 0; i < encrypt.length(); i++) {
                    char symbol = encrypt.charAt(i);
                    if (symbol == ' ' || symbol == '\'') {
                        sb.append(symbol);
                    } else if (symbol == ':') {
                        sb.append('@');
                    } else {
                        if (Character.isLowerCase(symbol)) {
                            if (symbol + length > 122) {
                                sb.append((char) (96 + (symbol + length) - 122));
                            } else {
                                sb.append((char) (symbol + length));
                            }
                        } else if (Character.isUpperCase(symbol)) {
                            if (symbol + length > 90) {
                                sb.append((char) (64 + (symbol + length) - 90));
                            } else {
                                sb.append((char) (symbol + length));
                            }
                        }
                    }
                }
                System.out.printf("Successful encryption: %s%n", sb);
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }
}