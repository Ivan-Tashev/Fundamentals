package BitAndBitwise;

import java.util.Scanner;

public class BitAndBitwise_01_BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());  // 20
        int b = Integer.parseInt(scanner.nextLine());
        String result = "";

        while (n > 0) {
            result = (n % 2) + result;
            n /= 2;
        }
        //System.out.println(result);

        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            if (String.valueOf(result.charAt(i)).equals(b + "")) sum++;
        }
        System.out.println(sum);
    }
}
