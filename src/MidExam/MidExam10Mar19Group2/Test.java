package MidExam.MidExam10Mar19Group2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Delete":
                    int index = Integer.parseInt(command[1]) + 1;
                    if (index >= 0 && index < words.size()) {
                        words.remove(index);
                    }
                    break;
                case "Swap":
                    String word1 = command[1];
                    String word2 = command[2];
                    if (words.contains(word1) && words.contains(word2)) {
                        int index1 = words.indexOf(word1);
                        int index2 = words.indexOf(word2);
                        words.set(index1, word2);
                        words.set(index2, word1);
                    }
                    break;
                case "Put":
                    String word = command[1];
                    index = Integer.parseInt(command[2]);
                    if (index - 1 >= 0 && index - 1 < words.size()) {
                        if (index - 1 == words.size() - 1) {
                            words.add(word);
                        } else {
                            words.add(index - 1, word);
                        }
                    }
                    break;
                case "Sort":
                    Collections.reverse(words);
                    break;
                case "Replace":
                    word1 = command[1];
                    word2 = command[2];
                    if (words.contains(word2)) {
                        index = words.indexOf(word2);
                        words.set(index, word1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", words));
    }
}
