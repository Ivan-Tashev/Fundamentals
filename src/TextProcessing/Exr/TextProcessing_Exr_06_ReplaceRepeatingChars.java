package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // aaaaabbbbbcdddeeeedssaa

        char[] chars = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != (chars[i + 1])) {
                sb.append(chars[i]);
            }
        }
        sb.append(chars[chars.length - 1]);
        System.out.println(sb);
    }
}