package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sumLiters =0;

        for (int i = 0; i < n; i++) {
            int qtyLiters = Integer.parseInt(scanner.nextLine());
            if (qtyLiters > capacity) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacity -= qtyLiters;
            sumLiters += qtyLiters;
        }
        System.out.println(sumLiters);
    }
}
