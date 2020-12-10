package Arrays.Exercise;

import java.util.Scanner;

public class Arrays_Exercise_07_MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int counter = 1;
        int max = 0;
        String[] sequence = new String[max];

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].equals(input[i + 1])) {
                counter += 1;
            } else {
                counter = 1;
            }
            if (counter > max) {
                max = counter;
                sequence = new String[max];
                for (int j = 0; j < max; j++) {
                    sequence[j] = input[i];
                }
            }
        }
        for (String item : sequence) {
            System.out.print(item + " ");
        }
    }
}

