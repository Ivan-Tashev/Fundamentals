package MidExam.MidExam29Feb20Group1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExam_29Feb20_02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Go Shopping!".equals(input)) {
            String[] command = input.split("\\s+");
            String item = command[1];
            switch (command[0]) {
                case "Urgent":
                    if (!products.contains(item)) products.add(0,item);
                    break;
                case "Unnecessary":
                    if (products.contains(item)) products.remove(item);
                    break;
                case "Correct":
                    if (products.contains(item)) {
                        int indexToSet = products.indexOf(item);
                        products.set(indexToSet, command[2]);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)){
                        products.remove(item);
                        products.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < products.size() - 1; i++) {
            System.out.print(products.get(i) + ", ");
        }
        System.out.println(products.get(products.size() - 1));
    }
}
