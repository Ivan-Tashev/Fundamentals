package MidExam.MidExam29Feb20Group2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExam_29Feb20Group2_03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Craft!".equals(input)) {
            String[] command = input.split(" - ");
            String item = command[1];

            switch (command[0]) {
                case "Collect":
                    if (!items.contains(item)) items.add(item);
                    break;
                case "Drop":
                    if (items.contains(item)) items.remove(item);
                    break;
                case "Combine Items":
                    String[] oldNew = item.split(":");
                    if (items.contains(oldNew[0])) {
                        int index = items.indexOf(oldNew[0]);
                        items.add(index + 1,oldNew[1]);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(String.join(", ", items));

    }
}
