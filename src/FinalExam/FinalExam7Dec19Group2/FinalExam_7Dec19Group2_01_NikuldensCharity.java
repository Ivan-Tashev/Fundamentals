package FinalExam.FinalExam7Dec19Group2;

import java.util.Scanner;

public class FinalExam_7Dec19Group2_01_NikuldensCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ILikeSharan
        //Replace a e
        //Make Upper
        //Check SHEREN
        //Sum 1 4
        //Cut 1 4
        //Finish

        String message = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Replace":
                    message = message.replaceAll(command[1], command[2]);
                    System.out.println(message);
                    break;
                case "Cut":
                    int beg = Integer.parseInt(command[1]);
                    int end = Integer.parseInt(command[2]);
                    if (!(beg >= 0 && beg < message.length()) || !(end >= 0 && end < message.length()) || beg > end) {
                        System.out.println("Invalid indexes!");
                    } else {
                        message = message.substring(0, beg) + message.substring(end + 1);
                        System.out.println(message);
                    }
                    break;
                case "Make":
                    if ("Upper".equals(command[1])){
                        message = message.toUpperCase();
                    } else if ("Lower".equals(command[1])){
                        message = message.toLowerCase();
                    }
                    System.out.println(message);
                    break;
                case "Check":
                    if (message.contains(command[1])){
                        System.out.printf("Message contains %s%n", command[1]);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", command[1]);
                    }
                    break;
                case "Sum":
                    beg = Integer.parseInt(command[1]);
                    end = Integer.parseInt(command[2]);
                    if (!(beg >= 0 && beg < message.length()) || !(end >= 0 && end < message.length()) || beg > end) {
                        System.out.println("Invalid indexes!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < message.substring(beg, end + 1).length(); i++) {
                            sum += message.substring(beg, end + 1).charAt(i);
                        }
                        System.out.println(sum);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}