package MidExam.MidExam7Apr20Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExam_7Apr2020_03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 52 74 23 44 96 110
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            int index = Integer.parseInt(command[1]);
            switch (command[0]) {
                case "Shoot":
                    int power = Integer.parseInt(command[2]);
                    int targetValue;
                    if (index >= 0 && index < targets.size()){
                        targetValue = targets.get(index) - power;
                        targets.set(index,targetValue);
                        if (targetValue <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(command[2]);
                    int toRemove = radius * 2 + 1;
                    if ((index - radius) >= 0 && (index + radius) < targets.size()){
                        for (int i = 0; i < toRemove ; i++) {
                            targets.remove(index -radius);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targets.size()){
                        targets.add(index, Integer.parseInt(command[2]));
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < targets.size() - 1; i++) {
            int n = targets.get(i);
            System.out.print(n + "|");
        }
        System.out.print(targets.get(targets.size() - 1));
    }
}
