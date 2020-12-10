package MidExam.MidExam5Jul20;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //23 -2 321 87 42 90 -123
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    int temp = nums[index1];
                    nums[index1] = nums[index2];
                    nums[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(command[1]);
                    index2 = Integer.parseInt(command[2]);
                    nums[index1] = nums[index1] * nums[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = nums[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", Arrays.toString(nums))
                .replaceAll("[\\[\\]]", ""));
    }
}