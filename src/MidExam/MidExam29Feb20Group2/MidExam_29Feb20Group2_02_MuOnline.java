package MidExam.MidExam29Feb20Group2;

import java.util.Scanner;

public class MidExam_29Feb20Group2_02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int bestroom;
        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {

            String[] command = rooms[i].split(" ");
            int num = Integer.parseInt(command[1]);

            switch (command[0]) {
                case "potion":
                    if (health + num > 100) num = 100 - health;
                    health += num;
                    System.out.printf("You healed for %d hp.%n", num);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", num);
                    bitcoins += num;
                    break;
                default:
                    health -= num;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command[0]);
                        bestroom = i + 1;
                        System.out.printf("Best room: %d", bestroom);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }
}
