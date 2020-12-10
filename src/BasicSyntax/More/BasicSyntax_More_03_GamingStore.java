package BasicSyntax.More;

import java.util.Scanner;

public class BasicSyntax_More_03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double begBalance = balance;
        String input = scanner.nextLine();
        double price = 0.;
        double spent = 0.;

        while (!input.equals("Game Time")) {
            switch (input){
                case "OutFall 4":price = 39.99;break;
                case "RoverWatch Origins Edition":price = 39.99;break;
                case "CS: OG": price = 15.99;break;
                case "Zplinter Zell": price = 19.99;break;
                case "Honored 2": price = 59.99;break;
                case "RoverWatch": price = 29.99;break;
                default:
                    System.out.printf("%nNot Found");
                    input = scanner.nextLine();
                    continue;
            }
            balance -= price;
            spent += price;
            if (balance == 0) {
                System.out.printf("%nBought %s%n", input);
                System.out.println("Out of money!");
                return;
            } else if (balance < 0) {
                System.out.printf("%nToo Expensive");
                balance += price;
                spent -= price;
            } else {
                System.out.printf("%nBought %s", input);
            }
            input = scanner.nextLine();
        }
        double diff = begBalance - spent;
        System.out.printf("%nTotal spent: $%.2f. Remaining: $%.2f",spent,diff);
    }
}
