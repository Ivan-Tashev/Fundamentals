package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_05_AddAndSubtract {

    public static int add(int one, int two) {
        return one + two;
    }

    public static int subtract(int result, int three) {
        return result - three;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(add(one, two), three));
    }
}
