package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_09_GreaterOfTwoValues {

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static char getMax(char a, char b) {
        char result;
        if (a > b) result = a;
        else result = b;
        return result;
    }

    public static String getMax(String a, String b) {
        String result;
        if (a.compareTo(b) >= 0) result = a;
        else result = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int": {
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a, b));
                break;
            }
            case "char": {
                char a = scanner.nextLine().charAt(0);
                char b = scanner.nextLine().charAt(0);
                System.out.println(getMax(a, b));
                break;
            }
            case "string": {
                String a = scanner.nextLine();
                String b = scanner.nextLine();
                System.out.println(getMax(a, b));
                break;
            }
        }
    }
}
