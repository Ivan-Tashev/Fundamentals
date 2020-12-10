package MidExam.MidExam10Mar19Group1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //115 115 101 114 73 111 116 75
        List<String> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Change":
                    if (nums.contains(command[1])) {
                        nums.set(nums.indexOf(command[1]), command[2]);
                    }
                    break;
                case "Hide":
                    if (nums.contains(command[1])) {
                        nums.remove(command[1]);
                    }
                    break;
                case "Switch":
                    if (nums.contains(command[1]) && nums.contains(command[2])) {
                        int index1 = nums.indexOf(command[1]);
                        int index2 = nums.indexOf(command[2]);
                        nums.set(index1, command[2]);
                        nums.set(index2, command[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < nums.size() - 1) {
                        nums.add(index + 1, command[2]);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(nums);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", nums));
    }
}