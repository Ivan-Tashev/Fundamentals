package MidExam.MidExam30Jun10Group1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberArray_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Switch":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < nums.length) {
                        if (nums[index] > 0) {
                            nums[index] = -nums[index];
                        } else if (nums[index] < 0) {
                            nums[index] = nums[index];
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(command[1]);
                    int num = Integer.parseInt(command[2]);
                    if (index >= 0 && index < nums.length) {
                        nums[index] = num;
                    }
                    break;
                case "Sum":
                    switch (command[1]) {
                        case "Negative":
                            int sumNegative = 0;
                            for (int n : nums) {
                                if (n < 0) sumNegative += n;
                            }
                            System.out.println(sumNegative);
                            break;
                        case "Positive":
                            int sumPositive = 0;
                            for (int n : nums) {
                                if (n > 0) sumPositive += n;
                            }
                            System.out.println(sumPositive);
                            break;
                        case "All":
                            int sum = 0;
                            for (int n : nums) {
                                sum += n;
                            }
                            System.out.println(sum);
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                numbers.add(String.valueOf(nums[i]));
            }
        }
        System.out.print(String.join(" ", numbers));
    }
}
