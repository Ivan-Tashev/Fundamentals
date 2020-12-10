package Methods.Lab;

import java.util.Scanner;

public class Lab_06_CalculateRectangleArea {

    public static int calcAreaRectangle(int width, int length) {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(calcAreaRectangle(width,length));
    }
}
