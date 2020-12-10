package Methods.Lab;

import java.util.Scanner;

public class Lab_10_MultiplyEvensByOdds {

    public static int findEvenSums(int num) {
        int evenSum = 0;
        int oddSum = 0;
        while (num > 0) {
            int curDigit = num % 10;
            if (curDigit % 2 == 0) {
                evenSum += curDigit;
            } else {
                oddSum += curDigit;
            }
            num /= 10;
        }
        return evenSum * oddSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        n = Math.abs(n);

        System.out.println(findEvenSums(n));
    }
}
