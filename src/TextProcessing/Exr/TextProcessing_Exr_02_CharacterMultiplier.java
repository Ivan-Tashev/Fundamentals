package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");
        String one = strings[0];
        String two = strings[1];

        int size = Math.min(one.length(), two.length());

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (one.charAt(i) * two.charAt(i));
        }

        if (one.length() > size){
            for (int i = size; i < one.length(); i++) {
                sum += one.charAt(i);
            }
        } else if (two.length() > size){
            for (int i = size; i < two.length(); i++) {
                sum += two.charAt(i);
            }
        }

        System.out.println(sum);
    }
}