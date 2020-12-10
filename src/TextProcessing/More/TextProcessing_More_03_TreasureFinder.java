package TextProcessing.More;

import java.util.Scanner;

public class TextProcessing_More_03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 2 1 3
        //ikegfp'jpne)bv=41P83X@
        //ujfufKt)Tkmyft'duEprsfjqbvfv=53V55XA
        //find

        String[] keyString = scanner.nextLine().split("\\s+");
        int[] key = new int[keyString.length];
        for (int i = 0; i < keyString.length; i++) {
            key[i] = Integer.parseInt(keyString[i]);
        }

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        while (!"find".equals(input)) {
            int j = 0;
            for (int i = 0; i < input.length(); i++) {
                if (j == key.length) {
                    j = 0;
                }
                result.append((char)(input.charAt(i) - key[j]));
                j++;
            }

            String type = result.substring(result.indexOf("&") + 1, result.lastIndexOf("&"));
            String coordinates = result.substring(result.indexOf("<") + 1, result.lastIndexOf(">"));
            System.out.printf("Found %s at %s%n", type, coordinates);
            input = scanner.nextLine();
            result = new StringBuilder();
        }
    }
}