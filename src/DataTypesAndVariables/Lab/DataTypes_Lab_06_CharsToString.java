package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class DataTypes_Lab_06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",one,two,three);
    }
}