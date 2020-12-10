package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_06_TriplesLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // n

        for (int i = 'a'; i < n + 'a'; i++) {
            for (int j = 97; j < n + 97; j++) {
                for (int k = 97; k < n + 97; k++) {
                    System.out.println(String.format("%c%c%c", i, j, k));
                }
            }
        }
    }
}