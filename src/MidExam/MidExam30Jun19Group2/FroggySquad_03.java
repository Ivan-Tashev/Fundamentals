package MidExam.MidExam30Jun19Group2;

import java.util.*;
import java.util.stream.Collectors;

public class FroggySquad_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> frogs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while (!"Print".equals(command[0])) {

            switch (command[0]) {
                case "Join":
                    frogs.add(command[1]);
                    break;
                case "Jump":
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index < frogs.size()) {
                        frogs.add(index, command[1]);
                    }
                    break;
                case "Dive":
                    index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < frogs.size()) {
                        frogs.remove(index);
                    }
                    break;
                case "First":
                    int count = Integer.parseInt(command[1]);
                    if (count > frogs.size()) count = frogs.size();
                    for (int i = 0; i < count; i++) {
                        System.out.print(frogs.get(i) + " ");
                    }
                    break;
                case "Last":
                    count = Integer.parseInt(command[1]);
                    if (count > frogs.size()) count = frogs.size();
                    for (int i = frogs.size() - count; i < frogs.size()  ; i++) {
                        System.out.print(frogs.get(i) + " ");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        System.out.println();
        if ("Normal".equals(command[1])){
            System.out.print("Frogs: ");
            System.out.println(String.join(" ", frogs));
        } else if ("Reversed".equals(command[1])){
            Collections.reverse(frogs);
            System.out.print("Frogs: ");
            System.out.println(String.join(" ", frogs));
        }
    }
}