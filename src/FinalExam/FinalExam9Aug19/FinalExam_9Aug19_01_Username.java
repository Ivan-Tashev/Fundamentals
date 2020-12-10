package FinalExam.FinalExam9Aug19;

import java.util.Scanner;

public class FinalExam_9Aug19_01_Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pesho
        //Case lower
        //Cut ES
        //Check @
        //Sign up

        String username = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"Sign up".equals(input)) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Case":
                    if ("lower".equals(command[1])){
                        username = username.toLowerCase();
                        System.out.println(username);
                    } else if ("upper".equals(command[1])){
                        username = username.toUpperCase();
                        System.out.println(username);
                    }
                    break;
                case "Reverse":
                    int beg = Integer.parseInt(command[1]);
                    int end = Integer.parseInt(command[2]);
                    if ((beg >=0 && beg <username.length() -1) && (end >=0 && end <username.length())){
                        StringBuilder sb = new StringBuilder(username.substring(beg, end + 1));
                        System.out.println(sb.reverse());
                    }
                    break;
                case "Cut":
                    if (username.contains(command[1])){
                        username = username.replace(command[1], "");
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, command[1]);
                    }
                    break;
                case "Replace":
                    if (username.contains(command[1])){
                        username = username.replaceAll(command[1], "*");
                        System.out.println(username);
                    }
                    break;
                case "Check":
                    if (username.contains(command[1])){
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.%n", command[1]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}