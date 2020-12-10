package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        double diff = Math.abs(a - b);

        if (diff > eps) System.out.printf("The difference of %.2f is too big (>eps)", diff);
        else if (diff < 0.0000001) System.out.printf("The difference %.8f < eps", diff);
        else System.out.printf("Border case. The difference %.7f == eps. We consider the numbers are different.", diff);
    }
}
