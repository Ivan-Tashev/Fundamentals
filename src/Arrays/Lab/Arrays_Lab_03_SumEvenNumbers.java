package Arrays.Lab;

import java.util.Scanner;

public class Arrays_Lab_03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String[] array = values.split(" ");
        int sum = 0;
        int[] nums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}
