package MidExam.MidExam10Mar19Group2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheFinalQuest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Congratulations! You last also through the have challenge!
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Delete":
                    int index = Integer.parseInt(command[1]) + 1;
                    if (index >= 0 && index < words.size()){
                        words.remove(index);
                    }
                    break;
                case "Swap":
                    if (words.contains(command[1]) && words.contains(command[2])){
                        int index1 = words.indexOf(command[1]);
                        int index2 = words.indexOf(command[2]);
                        words.set(index1, command[2]);
                        words.set(index2, command[1]);
                    }
                    break;
                case "Put":
                    index = Integer.parseInt(command[2]) - 1;
                    if (index >= 0 && index < words.size() - 1){
                        words.add(index, command[1]);
                    }
                    if (index == words.size() - 1) words.add(command[1]);
                    break;
                case "Sort":
                    Collections.reverse(words);
                    break;
                case "Replace":
                    if (words.contains(command[2])) {
                        words.set(words.indexOf(command[2]), command[1]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ",words));
    }
}