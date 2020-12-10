package BasicSyntax.Lab;

import java.util.Scanner;

public class BasicSyntax_Lab_11_MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (m > 10) {
            System.out.printf("%d X %d = %d%n", number, m, number * m);
            return;
        }
        while (m <= 10) {
            System.out.printf("%d X %d = %d%n", number, m, number * m);
            m++;
        }
    }
}
