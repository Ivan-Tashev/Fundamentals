package FinalExam.FinalExam4Apr20Group1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExam_4Apr20Group1_03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tortuga||345000||1250
        //Santo Domingo||240000||630
        //Havana||410000||1100
        //Sail
        //Plunder=>Tortuga=>75000=>380
        //Prosper=>Santo Domingo=>180
        //End

        String input = scanner.nextLine();
        Map<String, int[]> cities = new HashMap<>();
        while (!"Sail".equals(input)) {
            String[] command = input.split("\\|\\|");
            cities.putIfAbsent(command[0], new int[2]);
            cities.get(command[0])[0] += Integer.parseInt(command[1]); // [0] people;
            cities.get(command[0])[1] += Integer.parseInt(command[2]); // [1] gold;
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] token = input.split("=>");
            String city = token[1];
            if ("Plunder".equals(token[0])) {
                int people = Integer.parseInt(token[2]);
                int gold = Integer.parseInt(token[3]);
                cities.get(city)[0] -= people;
                cities.get(city)[1] -= gold;
                System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.",
                        city, gold, people));
                if (cities.get(city)[0] == 0 || cities.get(city)[1] == 0) {
                    System.out.println(String.format("%s has been wiped off the map!", city));
                    cities.remove(city);
                }

            } else if ("Prosper".equals(token[0])) {
                int gold = Integer.parseInt(token[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                    input = scanner.nextLine();
                    continue;
                }
                cities.get(city)[1] += gold;
                System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.",
                        gold, city, cities.get(city)[1]));
            }
            input = scanner.nextLine();
        }

        if (!cities.isEmpty()) {
            System.out.println(String.format("Ahoy, Captain! There are %d wealthy settlements to go to:",
                    cities.size()));
            cities
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> {
                        int res = b.getValue()[1] - a.getValue()[1];
                        if (b.getValue()[1] == a.getValue()[1]) {
                            res = a.getKey().compareTo(b.getKey());
                        }
                    return res;
                    })
                    .forEach(c -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            c.getKey(), c.getValue()[0], c.getValue()[1]));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}