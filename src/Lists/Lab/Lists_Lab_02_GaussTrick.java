package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Lab_02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> nums = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = nums.size();
        for (int i = 0; i < size / 2; i++) {
            nums.set(i, (nums.get(i) + nums.get(nums.size() - 1)));
            nums.remove(nums.size() - 1);
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
