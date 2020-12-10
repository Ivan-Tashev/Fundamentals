package MidExam.MidExam7Apr20Retake;

import java.util.Scanner;

public class MidExam_7Apr2020_01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int wins = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End of battle")) break;
            int distance = Integer.parseInt(input);
            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, energy);
                return;
            }
            energy -= distance;
            wins++;
            if (wins % 3 == 0) {
                energy += wins;
            }
        }
        System.out.printf("Won battles: %d. Energy left: %d", wins, energy);
    }
}