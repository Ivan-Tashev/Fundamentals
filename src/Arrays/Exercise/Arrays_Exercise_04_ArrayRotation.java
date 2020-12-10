package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Exercise_04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");  // 5
        int n = Integer.parseInt(scanner.nextLine()); // 2, 4...

        for (int i = 0; i < n; i++) {
            String temp = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
