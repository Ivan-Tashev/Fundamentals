package FinalExam.FinalExam3Aug19Group1;

import java.util.Scanner;

public class FinalExam_3Aug19Group1_01_StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Translate":
                    text = text.replaceAll(command[1], command[2]);
                    System.out.println(text);
                    break;
                case "Includes":
                    if (text.contains(command[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    if (text.substring(0, command[1].length()).equals(command[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    System.out.println(text.lastIndexOf(command[1]));
                    break;
                case "Remove":
                    int beg = Integer.parseInt(command[1]);
                    int count = Integer.parseInt(command[2]);
                    text = text.substring(0, beg) + text.substring(beg + count);
                    System.out.println(text);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}