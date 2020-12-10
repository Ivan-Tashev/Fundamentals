package FinalExam.FinalExam3Aug19Group1;

import java.util.*;

public class FinalExam_3Aug19Group1_03_MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Integer>> messages = new HashMap<>();
        String input = scanner.nextLine();
        while (!"Statistics".equals(input)) {
            String[] command = input.split("=");
            switch (command[0]) {
                case "Add":
                    messages.putIfAbsent(command[1], new ArrayList<>
                            (Arrays.asList(Integer.parseInt(command[2]),
                                    Integer.parseInt(command[3]))));

                    break;
                case "Message":
                    if (messages.containsKey(command[1]) && messages.containsKey(command[2])) {
                        messages.get(command[1]).set(0, messages.get(command[1]).get(0) + 1);
                        messages.get(command[2]).set(1, messages.get(command[2]).get(1) + 1);
                    }
                    if (messages.get(command[1]).get(0) + messages.get(command[1]).get(1) >= capacity) {
                        System.out.printf("%s reached the capacity!%n", command[1]);
                        messages.remove(command[1]);
                    }
                    if (messages.get(command[2]).get(0) + messages.get(command[2]).get(1) >= capacity) {
                        System.out.printf("%s reached the capacity!%n", command[2]);
                        messages.remove(command[2]);
                    }
                    break;
                case "Empty":
                    if (messages.containsKey(command[1])){
                        messages.remove(command[1]);
                    } else if ("All".equals(command[1])){
                        messages = new HashMap<>();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n", messages.size());
        messages
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().get(1) - a.getValue().get(1);
                    if (res == 0) res = a.getKey().compareTo(b.getKey());
                    return res;
                })
                .forEach(m -> {
                    System.out.printf("%s - %d%n", m.getKey(),
                            m.getValue().stream().mapToInt(Integer::intValue).sum());
                });
    }
}