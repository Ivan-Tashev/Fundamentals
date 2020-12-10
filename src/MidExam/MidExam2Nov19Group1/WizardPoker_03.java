package MidExam.MidExam2Nov19Group1;

import java.util.*;
import java.util.stream.Collectors;

public class WizardPoker_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(":"))
                .collect(Collectors.toList());

        List<String> deck = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"Ready".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Add":
                    if (!cards.contains(command[1])) System.out.println("Card not found.");
                    else deck.add(command[1]);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!cards.contains(command[1]) || (index < 0 || index >= deck.size()))
                        System.out.println("Error!");
                    else deck.add(index, command[1]);
                    break;
                case "Remove":
                    if (!deck.contains(command[1])) System.out.println("Card not found.");
                    else deck.remove(command[1]);
                    break;
                case "Swap":
                    int index1 = deck.indexOf(command[1]);
                    int index2 = deck.indexOf(command[2]);
                    String temp = deck.get(index1);
                    deck.set(index1, deck.get(index2));
                    deck.set(index2, temp);
                    break;
                case "Shuffle":
                    Collections.reverse(deck);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", deck));
    }
}