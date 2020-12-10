package Arrays.Lab;

import java.util.Scanner;

public class Arrays_Lab_04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String[] array = values.split(" ");
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i -1];
            System.out.print(reversed[i] + " ");
        }
    }
}
