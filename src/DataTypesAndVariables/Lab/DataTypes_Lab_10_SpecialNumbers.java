package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class DataTypes_Lab_10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int cur = i;
            while (cur > 0) {
                sum += cur % 10;
                cur /= 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) System.out.println(i + " -> True");
            else System.out.println(i + " -> False");
        }
    }
}
