package Arrays.Exercise;

import java.util.Scanner;

public class Arrays_Exercise_02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        for (String text2: input2) {
            for (String text1 : input1) {
                if (text1.equals(text2)) {
                    System.out.print(text2 + " ");
                }
            }
        }
    }
}