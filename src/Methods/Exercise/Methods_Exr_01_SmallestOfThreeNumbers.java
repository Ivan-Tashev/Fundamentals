package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_01_SmallestOfThreeNumbers {

    public static int getMin(Scanner scanner) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a < min) min = a;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = getMin(scanner);
        System.out.println(min);
    }
}
