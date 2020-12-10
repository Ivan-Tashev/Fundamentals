package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Arrays_Exercise_08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[input.length];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }
        int[] numbers = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (n == (numbers[i] + numbers[j])) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
