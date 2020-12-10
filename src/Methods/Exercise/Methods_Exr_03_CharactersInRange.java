package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_03_CharactersInRange {

    public static void charRange(char beg, char end) {
        if (beg <= end){
            for (int i = beg + 1; i < end ; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = end + 1; i < beg ; i++) {
                System.out.printf("%c ", i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        charRange(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));
    }
}
