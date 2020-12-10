package MidExam.MidExam2Nov19Group2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TanksCollector_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // T-34-85 Rudy, SU-100Y, STG
        List<String> tanks = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(", ");

            switch (command[0]) {
                case "Add":
                    if (tanks.contains(command[1])) System.out.println("Tank is already bought");
                    else {
                        System.out.println("Tank successfully bought");
                        tanks.add(command[1]);
                    }
                    break;
                case "Remove":
                    if (tanks.contains(command[1])){
                        System.out.println("Tank successfully sold");
                        tanks.remove(command[1]);
                    } else System.out.println("Tank not found");
                    break;
                case "Remove At":
                    int index = Integer.parseInt(command[1]);
                    if (index < 0 || index >= tanks.size()) System.out.println("Index out of range");
                    else {
                        tanks.remove(index);
                        System.out.println("Tank successfully sold");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(command[1]);
                    String name = command[2];
                    if (index < 0 || index >= tanks.size()) System.out.println("Index out of range");
                    if ((index >= 0 && index < tanks.size()) && !tanks.contains(name)) {
                        System.out.println("Tank successfully bought");
                        tanks.add(index, name);
                    } else if ((index >= 0 && index < tanks.size()) && tanks.contains(name))
                        System.out.println("Tank is already bought");
                    break;
            }
        }
        System.out.println(String.join(", ", tanks));
    }
}
