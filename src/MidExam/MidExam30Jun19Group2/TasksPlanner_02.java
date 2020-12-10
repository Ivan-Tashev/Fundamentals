package MidExam.MidExam30Jun19Group2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TasksPlanner_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tasks = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Complete":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 & index < tasks.size()) {
                        tasks.set(index, 0);
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(command[1]);
                    int time = Integer.parseInt(command[2]);
                    if (index >= 0 & index < tasks.size()) {
                        tasks.set(index, time);
                    }
                    break;
                case "Drop":
                    index = Integer.parseInt(command[1]);
                    if (index >= 0 & index < tasks.size()) {
                        tasks.set(index, -1);
                    }
                    break;
                case "Count":
                    switch (command[1]) {
                        case "Completed":
                            int count = 0;
                            for (int t : tasks) {
                                if (t == 0) {
                                    count++;
                                }
                            }
                            System.out.println(count);
                            break;
                        case "Incomplete":
                            count = 0;
                            for (int t : tasks) {
                                if (t > 0) {
                                    count++;
                                }
                            }
                            System.out.println(count);
                            break;
                        case "Dropped":
                            count = 0;
                            for (int t : tasks) {
                                if (t < 0) {
                                    count++;
                                }
                            }
                            System.out.println(count);
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        List<String> taskString = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i) > 0)
                taskString.add(String.valueOf(tasks.get(i)));
        }
        System.out.println(String.join(" ", taskString));
    }
}