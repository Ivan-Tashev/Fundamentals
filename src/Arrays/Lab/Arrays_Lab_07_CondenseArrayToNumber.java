package Arrays.Lab;

import java.util.Scanner;

public class Arrays_Lab_07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]); // arr: 2, 10, 3
        }

        while (numbers.length > 1) {
            int[] temp = new int[numbers.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = numbers[i] + numbers[i + 1];
            }
            numbers = temp;
        }
        System.out.println(numbers[0]);
    }
}
