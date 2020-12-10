package ObjectsAndClasses.Lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ObjectsClasses_Lab_03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            BigInteger num = new BigInteger(String.valueOf(i));
            result = result.multiply(num);
        }
        System.out.println(result);
    }
}