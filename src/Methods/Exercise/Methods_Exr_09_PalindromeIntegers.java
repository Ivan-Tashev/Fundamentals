package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_09_PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();  // 323 or 1001

        while (!"END".equals(input)) {
            isPalindromeNumber(input);
            input = scanner.nextLine();
        }
    }

    public static void isPalindromeNumber(String input) {
        int num = Integer.parseInt(input);

        boolean isPalindrome = true;
        if (num % 2 == 1) { // odd count of numbers in num
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                    System.out.println(false);
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println(true);
        } else {
            for (int i = 0; i < input.length() / 2 + 1; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                    System.out.println(false);
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.println(true);
        }
    }
}
