package FinalExam.FinalExam14Apr19Group2;

import java.util.*;

public class FinalExam_14Apr19Group2_02_PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> roads = new HashMap<>();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] command = input.split("->");
            String road = command[1];
            switch (command[0]) {
                case "Add":
                    if (roads.containsKey(road)){
                        roads.get(road).add(command[2]);
                    }
                    roads.putIfAbsent(road,new ArrayList<>(Arrays.asList(command[2])));
                    break;
                case "Move":
                    String racer = command[2];
                    String nextRoad = command[3];
                    if (roads.get(road).contains(racer)){
                        roads.get(road).remove(racer);
                        roads.get(nextRoad).add(racer);
                    }
                    break;
                case "Close":
                    if (roads.containsKey(road)){
                        roads.remove(road);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Practice sessions:");
        roads
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().size() - a.getValue().size();
                    if (res == 0){
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(r -> {
                    System.out.printf("%s%n", r.getKey());
                    r.getValue().forEach(p -> System.out.printf("++%s%n", p));
                });
    }
}