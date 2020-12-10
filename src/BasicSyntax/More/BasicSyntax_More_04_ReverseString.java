package BasicSyntax.More;

import java.util.Scanner;

public class BasicSyntax_More_04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = text.length()-1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
