package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int totalSpice = 0;
        int days = 0;

        while (startYield >= 100) {
            totalSpice += startYield - 26;
            startYield -= 10;
            days++;
        }
        if (startYield >= 26) {
            totalSpice -= 26;
        }
        System.out.println(days);
        System.out.println(totalSpice);
    }
}
