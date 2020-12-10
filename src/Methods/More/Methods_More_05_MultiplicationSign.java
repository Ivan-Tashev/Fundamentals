package Methods.More;

import java.util.Scanner;

public class Methods_More_05_MultiplicationSign {

    public static boolean negative(int n) {
        boolean neg = false;
        if (n < 0) {
            neg = true;
        }
        return neg;
    }

    public static boolean positive(int n) {
        boolean pos = false;
        if (n > 0) {
            pos = true;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 == 0 || num2 == 0 || num3 == 0) System.out.println("zero");
        else if ((negative(num1) && negative(num2) && negative(num3)) ||
       (negative(num1) && positive(num2) && positive(num3)) ||
                (positive(num1) && negative(num2) && positive(num3)) ||
                (positive(num1) && positive(num2) && negative(num3)))
            System.out.println("negative");
        else System.out.println("positive");
    }
}
