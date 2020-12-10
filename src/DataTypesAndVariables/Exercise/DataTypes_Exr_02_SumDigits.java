package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int result = 0;

        // option 1
        for (int i = num; i > 0; i /= 10) {
            int lastDigit = i % 10;
            result += lastDigit;
        }

        // option 2
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        System.out.println(result / 2);
    }
}
