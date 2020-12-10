package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_08_MathPower {

    public static double mathPow(double num, int pow) {
        return Math.pow(num, pow);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPow(num,pow)));
    }
}
