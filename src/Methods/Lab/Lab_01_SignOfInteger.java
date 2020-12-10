package Methods.Lab;

import java.util.Scanner;

public class Lab_01_SignOfInteger {

    public static void signInt (int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        signInt(Integer.parseInt(scanner.nextLine()));
    }
}
