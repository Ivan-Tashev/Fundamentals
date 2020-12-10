package ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ObjectsClasses_Lab_01_RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int num = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[num];
            words[num] = temp;
        }

        for (String item:words) {
            System.out.println(item);
        }
    }
}
