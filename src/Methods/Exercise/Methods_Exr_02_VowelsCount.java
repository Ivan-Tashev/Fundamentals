package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_02_VowelsCount {

    public static int vowelsCounter(String input) {
        int count = 0;
        char[] vowels = {'a', 'e', 'u', 'i', 'o', 'y', 'A', 'E', 'U', 'I', 'O', 'Y'};
        for (int i = 0; i < input.length(); i++) {
            for (char vows : vowels) {
                if (input.charAt(i) == vows) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(vowelsCounter(input));
    }
}