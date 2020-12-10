package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            symbol += key;
            System.out.print(symbol);
        }
    }
}
