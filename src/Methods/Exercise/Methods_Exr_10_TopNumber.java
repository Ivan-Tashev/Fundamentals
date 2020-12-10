package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_10_TopNumber {

    public static boolean devideBy8(int cur) {
        boolean devidableBy8 = false;
        int sum = 0;
        while (cur > 0) {
            int lastDigit = cur % 10;
            sum += lastDigit;
            cur /= 10;
        }
        if (sum % 8 == 0) {
            devidableBy8 = true;
        }
        return devidableBy8;
    }

    public static boolean oddDigit(int cur) {
        boolean haveOddDigit = false;
        while (cur > 0) {
            int lastDigit = cur % 10;
            if (lastDigit % 2 == 1) haveOddDigit = true;
            cur /= 10;
        }
        return haveOddDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean devidableBy8 = devideBy8(i);
            boolean haveOddDigit = oddDigit(i);

            if (devidableBy8 && haveOddDigit) System.out.println(i);
        }
    }
}
