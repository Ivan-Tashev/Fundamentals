package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class DataTypes_Lab_02_oundsToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gbp = Double.parseDouble(scanner.nextLine());
        double usd = gbp * 1.31;

        System.out.printf("%.3f", usd);
    }
}
