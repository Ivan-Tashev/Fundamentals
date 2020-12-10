package Methods.Lab;

import java.util.Scanner;

public class Lab_05_Orders {

    public static void orderPrice(String item, int qty) {
        switch (item) {
            case "coffee":
                System.out.printf("%.2f", (qty * 1.5));
                break;
            case "water":
                System.out.printf("%.2f", (qty * 1.));
                break;
            case "coke":
                System.out.printf("%.2f", qty * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f", qty * 2.);
                break;
        }
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());

        orderPrice(product, qty);
    }
}
