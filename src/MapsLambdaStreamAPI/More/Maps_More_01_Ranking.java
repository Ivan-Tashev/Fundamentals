package MapsLambdaStreamAPI.More;

import java.util.*;

public class Maps_More_01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Part One Interview:success
        //Js Fundamentals:Pesho
        //C# Fundamentals:fundPass
        //Algorithms:fun
        //end of contests
        //C# Fundamentals=>fundPass=>Tanya=>350
        //Algorithms=>fun=>Tanya=>380
        //Part One Interview=>success=>Nikola=>120
        //Java Basics Exam=>pesho=>Petkan=>400
        //Part One Interview=>success=>Tanya=>220
        //OOP Advanced=>password123=>BaiIvan=>231
        //C# Fundamentals=>fundPass=>Tanya=>250
        //C# Fundamentals=>fundPass=>Nikola=>200
        //Js Fundamentals=>Pesho=>Tanya=>400
        //end of submissions

        HashMap<String, String> contests = new HashMap<>();
        HashMap<String, Map<String, Integer>> users = new HashMap<>();
        String input = scanner.nextLine();
        while (!"end of contests".equals(input)) {
            if (input.contains(":")) {
                String[] line = input.split(":");
                contests.putIfAbsent(line[0], line[1]);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!"end of submissions".equals(input)) {
            String[] line = input.split("=>");
            String contest = line[0];
            String password = line[1];
            String user = line[2];
            int points = Integer.parseInt(line[3]);

            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {
                users.putIfAbsent(user, new HashMap<>());
                if (users.containsKey(user)) {
                    users.get(user).putIfAbsent(contest, points);
                    if (users.get(user).containsKey(contest)) {
                        if (users.get(user).get(contest) < points) {
                            users.get(user).put(contest, points);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        int maxSum = 0;
        String bestUser = "";
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : users
                .entrySet()) {
            int sum = stringMapEntry.getValue()
                    .values()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            if (sum > maxSum) {
                maxSum = sum;
                bestUser = stringMapEntry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestUser, maxSum);

        System.out.println("Ranking: ");
        users
                .entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(u -> {
                    System.out.printf("%s%n", u.getKey());
                    u.getValue()
                            .entrySet()
                            .stream()
                            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(c -> System.out.printf("#  %s -> %d%n", c.getKey(), c.getValue()));
                });
    }
}