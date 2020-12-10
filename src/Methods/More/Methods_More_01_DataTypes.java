package Methods.More;

import java.util.Scanner;

public class Methods_More_01_DataTypes {

    public static int action(int input) {
        return input * 2;
    }

    public static double action(double input) {
        return input * 1.5;
    }

    public static String action(String input) {
        return "$" + input + "$";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();

        if (type.equals("int")) {
            int n = Integer.parseInt(input);
            System.out.println(action(n));
        }
        else if (type.equals("real")) {
            double n = Double.parseDouble(input);
            System.out.printf("%.2f", action(n));
        } else {
            System.out.println(action(input));
        }
    }
}
