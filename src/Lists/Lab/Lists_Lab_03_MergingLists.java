package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Lab_03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        List<String> items1 = Arrays.stream(input1.split(" "))
                .collect(Collectors.toList());
        String input2 = scanner.nextLine();
        List<String> items2 = Arrays.stream(input2.split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.max(items1.size(), items2.size()); i++) {
            if (items1.size() > i) result.add(items1.get(i));
            if (items2.size() > i) result.add(items2.get(i));
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
