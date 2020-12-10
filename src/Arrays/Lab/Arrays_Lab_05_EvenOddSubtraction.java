package Arrays.Lab;

import java.util.Scanner;

public class Arrays_Lab_05_EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String[] array = values.split(" ");
        int[] nums = new int[array.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
            if (nums[i] % 2 == 0) {
                sumEven += nums[i];
            } else {
                sumOdd += nums[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
