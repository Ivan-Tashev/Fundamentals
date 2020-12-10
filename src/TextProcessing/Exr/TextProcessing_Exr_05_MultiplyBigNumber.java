package TextProcessing.Exr;

import java.math.BigInteger;
import java.util.Scanner;

public class TextProcessing_Exr_05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num = new BigInteger(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        num = num.multiply(BigInteger.valueOf(n));

        System.out.println(num);
    }
}