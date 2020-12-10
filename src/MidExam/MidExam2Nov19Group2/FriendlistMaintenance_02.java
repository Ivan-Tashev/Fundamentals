package MidExam.MidExam2Nov19Group2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendlistMaintenance_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friends = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int blacklisted = 0;
        int lost = 0;

        while (!"Report".equals(input)) {
            String[] command = input.split("\\s+");

            // Blacklist Mike; Error 0; Change 2 Mike123
            switch (command[0]) {
                case "Blacklist":
                    String name = command[1];
                    if (!friends.contains(name)) {
                        System.out.printf("%s was not found.%n", name);
                    } else {
                        int index = friends.indexOf(name);
                        friends.set(index, "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                        blacklisted++;
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command[1]);
                    name = friends.get(index);
                    if (!"Blacklisted".equals(name) && !"Lost".equals(name)) {
                        friends.set(index, "Lost");
                        lost++;
                        System.out.printf("%s was lost due to an error.%n", name);
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(command[1]);
                    name = command[2];
                    if (index >= 0 && index < friends.size()) {
                        System.out.printf("%s changed his username to %s.%n", friends.get(index), name);
                        friends.set(index, name);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklisted);
        System.out.printf("Lost names: %d%n", lost);
        System.out.println(String.join(" ",friends));
    }
}
