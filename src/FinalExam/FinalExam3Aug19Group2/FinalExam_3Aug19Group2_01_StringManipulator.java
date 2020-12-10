package FinalExam.FinalExam3Aug19Group2;

import java.util.Scanner;

public class FinalExam_3Aug19Group2_01_StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String line = scanner.nextLine();
        while (!"Done".equals(line)) {
            String[] command = line.split("\\s+");
            switch (command[0]) {
                case "Change":
                    String old = command[1];
                    String replace = command[2];
                    input = input.replaceAll(old, replace);
                    System.out.println(input);
                    break;
                case "Includes":
                    if (input.contains(command[1])) System.out.println("True");
                    else System.out.println("False");
                    break;
                case "End":
                    String end = command[1];
                    if (input.substring(input.length() - end.length() - 1).equals(end))
                        System.out.println("True");
                    else System.out.println("False");
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    System.out.println(input.indexOf(command[1]));
                    break;
                case "Cut":
                    int beg = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    input = input.substring(beg, beg + length);
                    System.out.println(input);
                    break;
            }
            line = scanner.nextLine();
        }
    }
}