package Lists.More;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_More_02_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        double sumLeft = 0.;
        for (int i = 0; i <= nums.size() / 2 - 1; i++) {
            sumLeft += nums.get(i);
            if (nums.get(i) == 0) sumLeft *= 0.8;
        }

        double sumRight = 0.;
        for (int i = nums.size() - 1; i > nums.size() / 2; i--) {
            sumRight += nums.get(i);
            if (nums.get(i) == 0) sumRight *= 0.8;
        }

        if (sumLeft < sumRight) {
            System.out.printf("The winner is left with total time: %.1f", sumLeft);
        } else if (sumRight < sumLeft) {
            System.out.printf("The winner is right with total time: %.1f", sumRight);
        }
    }
}
