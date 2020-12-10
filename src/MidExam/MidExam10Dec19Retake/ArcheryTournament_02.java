package MidExam.MidExam10Dec19Retake;

import java.util.Arrays;
import java.util.Scanner;

public class ArcheryTournament_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\|"))
                .mapToInt(Integer::parseInt).toArray();
        int points = 0;

        String input = scanner.nextLine();
        while (!"Game over".equals(input)) {
            String[] command = input.split("@");
            if (command[0].equals("Reverse")) {
                for (int i = 0; i < targets.length / 2 + 1; i++) {
                    int temp = targets[i];
                    targets[i] = targets[targets.length - 1 - i];
                    targets[targets.length - 1 - i] = temp;
                }
                input = scanner.nextLine();
                continue;
            }
            int index = Integer.parseInt(command[1]);
            if (index >= targets.length || index < 0) {
                input = scanner.nextLine();
                continue;
            }
            int length = Integer.parseInt(command[2]);

            switch (command[0]) {
                case "Shoot Left":
                    if (index - length < 0) {
                        int left = length % targets.length;
                        if (index - left < 0) {
                            index = targets.length - left + index;
                        } else {
                            index -= left;
                        }
                    } else {
                        index -= length;
                    }
                    if (targets[index] >= 5) {
                        points += 5;
                        targets[index] -= 5;
                    } else {
                        points += targets[index];
                        targets[index] = 0;
                    }
                    break;

                case "Shoot Right":
                    if (index + length > targets.length - 1) {
                        int left = length % targets.length;
                        if (index + left >= targets.length) {
                            index = (index + left) - targets.length;
                        } else {
                            index += left;
                        }
                    } else {
                        index += length;
                    }
                    if (targets[index] >= 5) {
                        points += 5;
                        targets[index] -= 5;
                    } else {
                        points += targets[index];
                        targets[index] = 0;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < targets.length - 1; i++) {
            System.out.print(targets[i] + " - ");
        }
        System.out.println(targets[targets.length - 1]);
        System.out.printf("Iskren finished the archery tournament with %d points!", points);
    }
}
