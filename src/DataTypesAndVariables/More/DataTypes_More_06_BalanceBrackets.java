package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_06_BalanceBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String openBracket = "";
        String closeBracket = "";
        int counterOpen = 0;
        int counterClose = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean unbalanced = false;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openBracket = "(";
                counterOpen++;
                counterClose = 0;
                sum1 += 1;
            } else if (input.equals(")")) {
                closeBracket = ")";
                counterClose++;
                counterOpen = 0;
                sum2 += 1;
            }
            if (counterOpen > 1 || counterClose > 1) {
                unbalanced = true;
            }
        }
        if (unbalanced || sum1 != sum2) System.out.println("UNBALANCED");
        else System.out.println("BALANCED");
    }
}
