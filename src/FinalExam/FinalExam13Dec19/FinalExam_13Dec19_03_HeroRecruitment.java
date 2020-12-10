package FinalExam.FinalExam13Dec19;

import java.util.*;

public class FinalExam_13Dec19_03_HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enroll Stefan
        //Enroll Pesho
        //Enroll Stefan
        //Learn Stefan ItShouldWork
        //Learn Stamat ItShouldNotWork
        //Unlearn Gosho Dispel
        //Unlearn Stefan ItShouldWork
        //End

        String input = scanner.nextLine();
        Map<String, List<String>> heroes = new LinkedHashMap<>();

        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            String name = command[1];

            switch (command[0]) {
                case "Enroll":
                    if (heroes.containsKey(name)) {
                        System.out.println(String.format("%s is already enrolled.", name));
                    }
                    heroes.putIfAbsent(name, new ArrayList<>());
                    break;
                case "Learn":
                    String spell = command[2];
                    if (!heroes.containsKey(name)) {
                        System.out.println(String.format("%s doesn't exist.", name));
                    } else {
                        if (heroes.get(name).contains(spell)) {
                            System.out.println(String.format("%s has already learnt %s.", name, spell));
                        } else {
                            heroes.get(name).add(spell);
                        }
                    }
                    break;
                case "Unlearn":
                    spell = command[2];
                    if (heroes.containsKey(name) && heroes.get(name).contains(spell)) {
                        heroes.get(name).remove(spell);
                    } else if (heroes.containsKey(name) && !heroes.get(name).contains(spell)) {
                        System.out.println(String.format("%s doesn't know %s.", name, spell));
                    } else if (!heroes.containsKey(name)) {
                        System.out.println(String.format("%s doesn't exist.", name));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        heroes
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().size() - a.getValue().size();
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(h -> System.out.printf("== %s: %s%n",
                        h.getKey(), String.join(",", h.getValue())));
    }
}