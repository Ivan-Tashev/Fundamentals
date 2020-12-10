package BitAndBitwise;

import java.util.Scanner;

public class _ConvertBinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int sum = 0;
        int position = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += currentDigit * Math.pow(2,position);
            position++;
        }

        System.out.println(sum);
    }
}
