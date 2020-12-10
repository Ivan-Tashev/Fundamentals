package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Lab_07_RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        nums.removeIf(n -> n < 0);
        Collections.reverse(nums);

        if (nums.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
