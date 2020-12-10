package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_08_FactorialDivision {

    public static double factorial(int num) {
        double factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorial(a) / factorial(b));
    }
}
