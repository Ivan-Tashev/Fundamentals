package MapsLambdaStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Maps_Lab_04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(n -> n.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}