package BasicSyntax.Exercise;

import java.util.Scanner;

public class BasicSyntax_Exr_07_VendingMaschine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.;
        double purchase = 0.;

        while (!input.equals("Start")) {
            double coinsInserted = Double.parseDouble(input);
            if (coinsInserted == 0.1 || coinsInserted == 0.2 || coinsInserted == 0.5 || coinsInserted == 1.00 || coinsInserted == 2.00) {
                sum += coinsInserted;
            } else {
                System.out.printf("%nCannot accept %.2f%n", coinsInserted);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        double price = 0.;
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    input = scanner.nextLine();
                    continue;
            }
            purchase += price;
            if (sum < purchase) {
                System.out.print("Sorry, not enough money");
                purchase -= price;
            } else {
                System.out.println("Purchased " + input);
            }
            input = scanner.nextLine();
        }
        double change = sum - purchase;
        System.out.printf("Change: %.2f", change);
    }
}