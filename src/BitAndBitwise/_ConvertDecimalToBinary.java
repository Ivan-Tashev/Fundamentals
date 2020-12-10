package BitAndBitwise;

import java.util.Scanner;

public class _ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String binary = "";

        while (num > 0) {
            int currentDigit = num % 2;
            binary = currentDigit + binary;
            num /= 2;
        }

        System.out.println(binary);
    }
}
