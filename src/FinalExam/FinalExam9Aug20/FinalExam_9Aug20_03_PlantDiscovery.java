package FinalExam.FinalExam9Aug20;

import java.util.*;

public class FinalExam_9Aug20_03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> plants = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            double rarity = Double.parseDouble(input[1]);
            if (plants.containsKey(plant)) {
                plants.get(plant).set(0, rarity);
            } else {
                plants.put(plant, new ArrayList<>());
                plants.get(plant).add(0, rarity);
            }
        }

        String input = "";
        while (!"Exhibition".equals(input = scanner.nextLine())) {
            String[] command = input.split(":\\s+");
            String[] commandPlant = command[1].split("\\s+-\\s+");
            String plant = commandPlant[0];

            switch (command[0]) {
                case "Rate":
                    double rate = Double.parseDouble(commandPlant[1]);
                    if (plants.get(plant).size() > 1) {
                        plants.get(plant).set(1, ((plants.get(plant).get(1) + rate)) / 2);
                    } else {
                        plants.get(plant).add(1, rate);
                    }
                    break;
                case "Update":
                    double rarity = Double.parseDouble(commandPlant[1]);
                    if (plants.get(plant).get(0) > 0) {
                        plants.get(plant).set(0, rarity);
                    }
                    break;
                case "Reset":
                    plants.get(plant).set(1, 0.);
                    while (plants.get(plant).size() > 2){
                        plants.get(plant).remove(2);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        System.out.println("Plants for the exhibition:");
        plants
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    double res = b.getValue().get(0) - a.getValue().get(0);
                    if (res == 0.){
                        res = b.getValue().get(1) - a.getValue().get(1);
                    }
                    return (int) res;
                })
                .forEach(p -> System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",
                        p.getKey(), p.getValue().get(0), p.getValue().get(1)));
    }
}