package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_04_SumChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < numOfLines; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += letter;
        }
        System.out.println(String.format("The sum equals: %d", sum));
    }
}
