package MidExam.MidExam6Aug19Retake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Yohoho!".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        if (!loot.contains(command[i])) {
                            loot.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < loot.size()) {
                        String temp = loot.get(index);
                        loot.remove(index);
                        loot.add(temp);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    if (count >= loot.size()) {
                        System.out.println(String.join(", ", loot));
                        loot.clear();
                        break;
                    }
                    List<String> stealed = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        stealed.add(loot.get(loot.size() - 1 - i));
                        loot.remove(loot.size() - 1 - i);
                    }
                    System.out.println();
                    System.out.print(String.join(", ", stealed));
                    break;
            }
            input = scanner.nextLine();
        }
        int length = 0;
        for (int i = 0; i < loot.size(); i++) {
            length += loot.get(i).length();
        }
        double avrTreasureGain = length * 1. / loot.size();
        if (loot.isEmpty()) System.out.print("Failed treasure hunt.");
        else System.out.printf("Average treasure gain: %.2f pirate credits.", avrTreasureGain);
    }
}