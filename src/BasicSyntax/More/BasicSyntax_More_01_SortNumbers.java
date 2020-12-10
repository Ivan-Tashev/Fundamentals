package BasicSyntax.More;

import java.util.Scanner;

public class BasicSyntax_More_01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a > b && a > c && b >= c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((a > b && a > c && b <= c)) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b > a && b > c && a >= c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b > a && b > c && a <= c) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c > a && c > b && a >= b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((c > a && c > b && a <= b)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
