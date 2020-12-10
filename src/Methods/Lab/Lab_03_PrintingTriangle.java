package Methods.Lab;

import java.util.Scanner;

public class Lab_03_PrintingTriangle {

    public static void printRow(int rowItems) {
        for (int i = 1; i <= rowItems; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printRow(i);
        }

        for (int i = n - 1; i > 0; i--) {
            printRow(i);
        }
    }
}
