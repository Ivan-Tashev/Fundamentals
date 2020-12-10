package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Exercise_03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] temp = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                arr1[i] = temp[0];
                arr2[i] = temp[1];
            } else {
                arr1[i] = temp[1];
                arr2[i] = temp[0];
            }
        }
        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}