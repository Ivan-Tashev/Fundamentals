package MidExam.MidExam6Aug19Retake;

import java.util.Arrays;
import java.util.Scanner;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirate = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();
        int[] warship = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"Retire".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Fire":
                    int index = Integer.parseInt(command[1]);
                    int damage = Integer.parseInt(command[2]);
                    if (index >= 0 && index < warship.length) {
                        warship[index] -= damage;
                        if (warship[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    damage = Integer.parseInt(command[3]);
                    if ((startIndex >= 0 && startIndex < pirate.length) &&
                            (endIndex >= 0 && endIndex < pirate.length)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirate[i] -= damage;
                            if (pirate[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(command[1]);
                    int health = Integer.parseInt(command[2]);
                    if (index >= 0 && index < pirate.length) {
                        pirate[index] += health;
                        if (pirate[index] > maxHealth) {
                            pirate[index] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    double lower20percent = maxHealth * 0.2;
                    for (int value : pirate) {
                        if (value < lower20percent) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }
            input = scanner.nextLine();
        }
        int sumPirate = 0;
        for (int p : pirate) {
            sumPirate += p;
        }
        int sumWarship = 0;
        for (int w : warship) {
            sumWarship += w;
        }
        System.out.printf("Pirate ship status: %d%n", sumPirate);
        System.out.printf("Warship status: %d", sumWarship);
    }
}