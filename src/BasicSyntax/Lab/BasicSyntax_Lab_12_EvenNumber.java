package BasicSyntax.Lab;

import java.util.Scanner;

public class BasicSyntax_Lab_12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        do {
            n = Integer.parseInt(scanner.nextLine());
            n = Math.abs(n);
            if (n % 2 == 1) {
                System.out.println("Please write an even number.");
            } else {
                System.out.printf("The number is: %d", n);
            }
        } while (n % 2 != 0);
    }
}
