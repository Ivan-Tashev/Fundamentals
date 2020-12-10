package BasicSyntax.Exercise;

import java.util.Scanner;

public class BasicSyntax_Exr_05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reverse = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            reverse += username.charAt(i);
        }
        String pass = "";
        int counter = 0;
        while (!pass.equals(reverse)) {
            pass = scanner.nextLine();
            counter ++;
            if (pass.equals(reverse)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (counter > 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
    }
}
