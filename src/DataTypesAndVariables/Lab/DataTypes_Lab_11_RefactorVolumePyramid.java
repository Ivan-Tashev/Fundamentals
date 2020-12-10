package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class DataTypes_Lab_11_RefactorVolumePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double hight = Double.parseDouble(scanner.nextLine());
        double volume = (length * width) / 3 * hight;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
