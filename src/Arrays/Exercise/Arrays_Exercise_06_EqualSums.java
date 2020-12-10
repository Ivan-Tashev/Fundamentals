package Arrays.Exercise;

import java.util.Scanner;

public class Arrays_Exercise_06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) { // 1, 2, 3, 3
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int sumRight = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }
            int sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += numbers[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
