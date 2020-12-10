package Methods.Lab;

import java.util.Scanner;

public class Lab_11_MathOperations {

    public static double calculate(int a, String opr, int b) {
        double result = 0.;
        switch (opr) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (a * 1.) / b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(num1, operator, num2));
    }
}
