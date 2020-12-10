package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_04RefactorPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {
            boolean isThis = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isThis = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isThis);
        }
    }
}
