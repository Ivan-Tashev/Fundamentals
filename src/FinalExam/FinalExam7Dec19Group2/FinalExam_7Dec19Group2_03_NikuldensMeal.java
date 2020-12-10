package FinalExam.FinalExam7Dec19Group2;

import java.util.*;

public class FinalExam_7Dec19Group2_03_NikuldensMeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Like-Krisi-shrimps
        //Like-Krisi-soup
        //Like-Misho-salad
        //Like-Pena-dessert
        //Stop
        Map<String, List<String>> guests = new HashMap<>();
        String input = scanner.nextLine();
        int countUnlikeMeals = 0;
        while (!"Stop".equals(input)) {
            String[] command = input.split("-");
            String guest = command[1];
            String meal = command[2];

            switch (command[0]) {
                case "Like":
                    guests.putIfAbsent(guest, new ArrayList<>());
                    if (!guests.get(guest).contains(meal)) {
                        guests.get(guest).add(meal);
                    }
                    break;
                case "Unlike":
                    if (!guests.containsKey(guest)) {
                        System.out.println(String.format("%s is not at the party.", guest));
                    } else {
                        if (guests.get(guest).contains(meal)) {
                            guests.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);
                            countUnlikeMeals++;
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        guests
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().size() - a.getValue().size();
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(g -> {
                    System.out.printf("%s: ", g.getKey());
                    System.out.println(String.join(", ",g.getValue()));
                });
        System.out.printf("Unliked meals: %d", countUnlikeMeals);
    }
}