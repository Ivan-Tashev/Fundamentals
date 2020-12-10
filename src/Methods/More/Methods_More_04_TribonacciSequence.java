package Methods.More;

import java.util.Scanner;

public class Methods_More_04_TribonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine()); // 4
        int[] output = new int[num];
        output[0] = 1;
        output[1] = 1;
        output[2] = 2;

        for (int i = 3; i < num; i++) {
            output[i] = output[i - 1] + output[i - 2] + output[i - 3];
        }

        for (int n : output) {
            System.out.println(n + " ");
        }
    }
}
