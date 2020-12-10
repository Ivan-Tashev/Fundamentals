package MidExam.MidExam30Jun10Group1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> contacts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        while (true) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]) {
                case "Add":
                    if (!contacts.contains(input[1])) {
                        contacts.add(input[1]);
                    } else {
                        int index = Integer.parseInt(input[2]);
                        if (index >= 0 && index < contacts.size())
                        contacts.add(index, input[1]);
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(input[1]);
                    if (index >= 0 && index < contacts.size()) {
                        contacts.remove(index);
                    }
                    break;
                case "Export":
                    int startIndex = Integer.parseInt(input[1]);
                    int count = Integer.parseInt(input[2]);
                    if (startIndex < 0 || startIndex >= contacts.size()) {
                        continue;
                    }
                    if (startIndex + count > contacts.size() - 1) count = contacts.size() - startIndex;
                    for (int i = startIndex; i < startIndex + count - 1; i++) {
                        System.out.print(contacts.get(i) + " ");
                    }
                    System.out.print(contacts.get(startIndex + count - 1));
                    System.out.println();
                    break;
                case "Print":
                    switch (input[1]) {
                        case "Normal":
                            System.out.print("Contacts: ");
                            System.out.print(String.join(" ", contacts));
                            return;
                        case "Reversed":
                            Collections.reverse(contacts);
                            System.out.print("Contacts: ");
                            System.out.print(String.join(" ", contacts));
                            return;
                    }
                    break;
            }
        }
    }
}