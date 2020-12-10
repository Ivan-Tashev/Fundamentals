package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class DataTypes_Lab_12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int cur = i;
            while (cur > 0) {
                sum += cur % 10;
                cur = cur / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) System.out.printf("%d -> True%n", i);
            else System.out.printf("%d -> False%n", i);
            sum = 0;
        }
    }
}