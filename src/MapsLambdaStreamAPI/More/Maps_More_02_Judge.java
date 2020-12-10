package MapsLambdaStreamAPI.More;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Maps_More_02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pesho -> Algo -> 400
        //Gosho -> Algo -> 300
        //Stamat -> Algo -> 200
        //Pesho -> DS -> 150
        //Mimi -> DS -> 600
        //no more time

        Map<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();
        Map<String, LinkedHashMap<String, Integer>> users = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"no more time".equals(input)) {
            String[] line = input.split(" -> ");
            String name = line[0];
            String course = line[1];
            int points = Integer.parseInt(line[2]);

            contests.putIfAbsent(course, new LinkedHashMap<>());
            if (contests.get(course).containsKey(name)) {
                if (contests.get(course).get(name) < points) {
                    contests.get(course).put(name, points);
                }
            } else {
                contests.get(course).put(name, points);
            }

            users.putIfAbsent(name, new LinkedHashMap<>());
            if (users.get(name).containsKey(course)) {
                if (users.get(name).get(course) < points) {
                    users.get(name).put(course, points);
                }
            } else {
                users.get(name).put(course, points);
            }

            input = scanner.nextLine();
        }

        AtomicInteger s = new AtomicInteger(0);
        contests
                .entrySet()
                .stream()
                .forEach(c -> {
                    s.set(0);
                    System.out.printf("%s: %d participants%n", c.getKey(), c.getValue().size());
                    c.getValue()
                            .entrySet()
                            .stream()
                            .sorted((a, b) -> {
                                int res = b.getValue().compareTo(a.getValue());
                                if (res == 0) {
                                    res = a.getKey().compareTo(b.getKey());
                                }
                                return res;
                            })
                            .forEach(n -> System.out.printf("%d. %s <::> %d%n",
                                    s.incrementAndGet(), n.getKey(), n.getValue()));
                });

        Map<String, Integer> list = new LinkedHashMap<>();
        for (int i = 0; i < users.size(); i++) {

        }

        System.out.println("Individual standings:");
        s.set(0);
        users
                .entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(u -> {
                    u.getValue()
                            .entrySet()
                            .stream()
                            .sorted((c, d) -> d.getValue().compareTo(c.getValue()))
                            .forEach(n -> System.out.printf("%d. %s -> %d%n",
                                    s.incrementAndGet(), u.getKey(), n.getValue()));
                });
    }
}