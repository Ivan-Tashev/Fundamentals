package BasicSyntax.Exercise;

import java.util.Scanner;

public class BasicSyntax_Exr_10_rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int n = 0;
        double cost = (headsetPrice * (lostGamesCount / 2)) + (mousePrice * (lostGamesCount / 3)) + (keyboardPrice * (lostGamesCount / 6)) + (displayPrice * (lostGamesCount / 12));
        System.out.printf("Rage expenses: %.2f lv.",cost);
    }
}
