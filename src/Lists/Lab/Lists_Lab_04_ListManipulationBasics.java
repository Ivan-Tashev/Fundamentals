package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Lab_04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();  // Add 3, Remove 2, RemoveAt 1, Insert 8 3, end

        while (!"end".equals(command)) {
            String[] tokens = command.split(" "); // Add 3

            switch (tokens[0]) {
                case "Add":
                    int num = Integer.parseInt(tokens[1]);
                    nums.add(num);
                    break;
                case "Remove":
                    nums.remove(Integer.valueOf(tokens[1]));
                    break;
                case "RemoveAt":
                    nums.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int insert = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    nums.add(index, insert);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}
