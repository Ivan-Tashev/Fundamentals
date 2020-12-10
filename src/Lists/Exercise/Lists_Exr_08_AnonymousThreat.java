package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input: Ivo Johny Tony Bony Mony
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        // command: merge {startIndex} {endIndex} 0 1
        //command: divide {index} {partitions} 0 3
        boolean flag = true;
        while (flag) {
            List<String> command = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());

            switch (command.get(0)) {
                case "merge":
                    int startIndex = Integer.parseInt(command.get(1));
                    int endIndex = Integer.parseInt(command.get(2));
                    if (startIndex < 0) {
                        startIndex = 0;
                    } else if (endIndex > input.size() - 1) {
                        endIndex = input.size() - 1;
                    }
                    mergeIndex(input, startIndex, endIndex);
                    break;
                case "divide":
                    int index = Integer.parseInt(command.get(1));
                    int partitions = Integer.parseInt(command.get(2));
                    String element = input.get(index);
                    if (element.length() % partitions == 0) {
                        divide(element, partitions);
                        List<String> splited = Arrays.stream(divide(element, partitions).split(" "))
                                .collect(Collectors.toList());
                        input.remove(index);
                        for (int i = 0; i < splited.size(); i++) {
                            input.add(index + i, splited.get(i));
                        }
                    } else {
                        System.out.println(divideWithLeftover(element, partitions));
                        List<String> splited = Arrays.stream(divideWithLeftover(element, partitions).split(" "))
                                .collect(Collectors.toList());
                        input.remove(index);
                        for (int i = 0; i < splited.size(); i++) {
                            input.add(index + i, splited.get(i));
                        }
                    }
                    break;
                case "3:1":
                    flag = false;
                    break;
            }
        }
        // end by command: 3:1, sout array
        for (String item : input) {
            System.out.print(item + " ");
        }
    }

    // Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
    public static List<String> mergeIndex(List<String> input, int start, int end) {
        if (start >= end) return input;
        String element = input.get(start);
        for (int i = start + 1; i <= end; i++) {
            element += input.get(i);
        }
        input.set(start, element);
        for (int i = end; i >= start + 1; i--) {
            input.remove(i);
        }
        return input;
    }

    public static String divide(String element, int partitions) {
        // elementSpace "abcdef" % 3 == 0
        int newSize = element.length() / partitions;
        String newElement = "";

        for (int i = 0; i < element.length(); i++) {
            if (i > 0 && i % newSize == 0) {
                newElement += " ";
            }
            newElement += element.charAt(i);
        }
        return newElement;
    }

    public static String divideWithLeftover(String element, int partitions) {
        // elementSpace "abcdef" % 3 == 0
        int newSize = element.length() / partitions;
        String newElement = "";
        int conter = 1;

        for (int i = 0; i < element.length(); i++) {
            if (conter < partitions && i > 0 && i % newSize == 0) {
                newElement += " ";
                conter++;
            }
            newElement += element.charAt(i);
        }
        return newElement;
    }
}
