package FinalExam.FinalExam4Apr20Group1;

import java.util.Scanner;

public class FinalExam_4Apr20Group1_01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //abcdefghijklmnopqrstuvwxyz
        //Slice>>>2>>>6
        //Flip>>>Upper>>>3>>>14
        //Flip>>>Lower>>>5>>>7
        //Contains>>>def
        //Contains>>>deF
        //Generate

        String key = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"Generate".equals(input)) {
            String[] command = input.split(">>>");

            switch (command[0]) {
                case "Contains":
                    if (key.contains(command[1])) {
                        System.out.println(String.format("%s contains %s", key, command[1]));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int beg = Integer.parseInt(command[2]);
                    int end = Integer.parseInt(command[3]);
                    String current = key.substring(beg, end);
                    String newCurrent = "";
                    if ("Upper".equals(command[1])){
                        newCurrent = current.toUpperCase();
                    } else if ("Lower".equals(command[1])){
                         newCurrent = current.toLowerCase();
                    }
                    key = key.replace(current, newCurrent);
                    System.out.println(key);
                    break;
                case "Slice":
                    beg = Integer.parseInt(command[1]);
                    end = Integer.parseInt(command[2]);
                    current = key.substring(beg, end);
                    key = key.replace(current, "");
                    System.out.println(key);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);
    }
}