package Arrays.More;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_More_01_EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[rows];
        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u') {
                    int value = (int) input.charAt(j);
                    sum += (value * input.length());
                } else {
                    int value = (int) input.charAt(j);
                    sum += (value / input.length());
                }
            }
            numbers[i] = sum;
        }
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}

