package Arrays.Exercise;

import java.util.Scanner;

public class Arrays_Exercise_05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int cur = numbers[i];
            boolean isTopInt = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (cur <= numbers[j]) {
                    isTopInt = false;
                    break;
                }
            }
            if (isTopInt) System.out.print(cur + " ");
        }
        System.out.print(numbers[numbers.length-1]);
    }
}
