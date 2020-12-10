package FinalExam.FinalExam13Dec19;

import java.util.Scanner;

public class FinalExam_13Dec19_01_WarriorsQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fr1c710n
        //GladiatorStance
        //Dispel 2 I
        //Dispel 4 T
        //Dispel 6 O
        //Dispel 5 I
        //Dispel 10 I
        //Target Change RICTION riction
        //For Azeroth

        String skill = scanner.nextLine();
        String input = scanner.nextLine();
        while (!"For Azeroth".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "GladiatorStance":
                    skill = skill.toUpperCase();
                    System.out.println(skill);
                    break;
                case "DefensiveStance":
                    skill = skill.toLowerCase();
                    System.out.println(skill);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < skill.length()) {
                        skill = skill.substring(0, index) + command[2] + skill.substring(index + 1);
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                case "Target":
                    if ("Change".equals(command[1])) {
                        skill = skill.replace(command[2], command[3]);
                        System.out.println(skill);
                    } else if ("Remove".equals(command[1])) {
                        skill = skill.replace(command[2], "");
                        System.out.println(skill);
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
