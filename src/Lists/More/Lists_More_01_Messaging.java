package Lists.More;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_More_01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text = scanner.nextLine();

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);

            int sum = 0;
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }

            if (sum >= text.length()) {
                sum %= text.length();
            }
            System.out.print(text.charAt(sum + i));
        }
    }
}
