package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        System.out.println((int) Math.ceil(n * 1. / p));
    }
}
