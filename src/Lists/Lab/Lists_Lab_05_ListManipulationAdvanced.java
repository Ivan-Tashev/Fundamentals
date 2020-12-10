package Lists.Lab;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;

public class Lists_Lab_05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 13 43 876 342 23 543
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println();

        String command = scanner.nextLine();

        do {
            String[] tocken = command.split(" ");
            switch (tocken[0]) {
                case "Contains":
                    int contain = Integer.parseInt(tocken[1]);
                    if (nums.contains(contain)) System.out.println("Yes");
                    else System.out.println("No such number");
                    break;
                case "Print":
                    if (tocken[1].equals("even")) {
                        for (Integer num : nums) {
                            if (num % 2 == 0) System.out.print(num + " ");
                        }
                        System.out.println();
                    } else if (tocken[1].equals("odd")) {
                        for (Integer num : nums) {
                            if (num % 2 == 1) System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer num : nums) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int tockenAt2 = Integer.parseInt(tocken[2]);
                    if (tocken[1].equals("<")) {
                        for (int num:nums) {
                            if (num < tockenAt2) System.out.print(num + " ");
                        }
                        System.out.println();
                    } else if (tocken[1].equals(">")) {
                        for (int num:nums) {
                            if (num > tockenAt2) System.out.print(num + " ");
                        }
                        System.out.println();
                    } else if (tocken[1].equals("<=")) {
                        for (int num:nums) {
                            if (num <= tockenAt2) System.out.print(num + " ");
                        }
                        System.out.println();
                    } else if (tocken[1].equals(">=")) {
                        for (int num:nums) {
                            if (num >= tockenAt2) System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
            command = scanner.nextLine();
        } while (!"end".equals(command));
    }
}
