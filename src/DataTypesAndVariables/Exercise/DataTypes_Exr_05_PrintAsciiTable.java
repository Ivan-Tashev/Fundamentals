package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_05_PrintAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beg = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = beg; i <= end ; i++) {
            System.out.print(String.format("%c ",i));
        }
    }
}
