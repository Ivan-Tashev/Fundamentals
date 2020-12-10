package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Lab_01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        List<String> input = Arrays.stream(values.split(" ")).collect(Collectors.toList());
        List<Double> nums = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            nums.add(Double.parseDouble(input.get(i)));
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                nums.set(i, nums.get(i) * 2);
                nums.remove(i + 1);
                i = -1;
            }
        }

        for (double num:nums) {
            System.out.print(new DecimalFormat("0.#").format(num) + " ");
        }
    }
}
