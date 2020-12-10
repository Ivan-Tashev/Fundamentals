package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

        int result = (first + second) / third * fourth;
        System.out.println(result);
    }
}
