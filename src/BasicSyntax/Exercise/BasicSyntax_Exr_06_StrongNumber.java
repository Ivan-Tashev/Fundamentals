package BasicSyntax.Exercise;

import java.util.Scanner;

public class BasicSyntax_Exr_06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int cur = n;
        int sum = 1;
        int totalSum = 0;
        int lastDigit = 0;

        while (cur >= 1) {
            lastDigit = cur % 10;
            for (int i = 1; i <= lastDigit; i++) { // Factorial last digit
                sum = sum * i;
            }
            cur /= 10;
            totalSum += sum;
            sum = 1;
        }

        if (totalSum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
