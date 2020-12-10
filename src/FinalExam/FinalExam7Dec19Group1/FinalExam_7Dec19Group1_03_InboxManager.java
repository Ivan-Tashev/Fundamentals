package FinalExam.FinalExam7Dec19Group1;

import java.util.*;

public class FinalExam_7Dec19Group1_03_InboxManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Add->Mike
        //Add->George
        //Send->George->Hello World
        //Send->George->Some random test mail
        //Send->Mike->Hello, do you want to meet up tomorrow?
        //Send->George->It would be a pleasure
        //Send->Mike->Another random test mail
        //Statistics

        Map<String, List<String>> users = new HashMap<>();
        String input = scanner.nextLine();
        while (!"Statistics".equals(input)) {
            String[] command = input.split("->");
            String user = command[1];
            switch (command[0]) {
                case "Add":
                    if (users.containsKey(user)) {
                        System.out.println(String.format("%s is already registered", user));
                    }
                    users.putIfAbsent(user, new ArrayList<>());
                    break;
                case "Send":
                    if (users.containsKey(user)) {
                        users.get(user).add(command[2]);
                    }
                    break;
                case "Delete":
                    if (users.containsKey(user)) {
                        users.remove(user);
                    } else {
                        System.out.printf("%s not found!%n", user);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n", users.size());
        users
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().size() - a.getValue().size();
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(u -> {
                    System.out.println(u.getKey());
                    u.getValue().forEach(s -> System.out.printf(" - %s%n", s));
                });
    }
}