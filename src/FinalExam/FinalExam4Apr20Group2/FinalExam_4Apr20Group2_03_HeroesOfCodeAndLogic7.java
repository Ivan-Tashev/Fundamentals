package FinalExam.FinalExam4Apr20Group2;

import java.util.*;

public class FinalExam_4Apr20Group2_03_HeroesOfCodeAndLogic7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2
        //Solmyr 85 120
        //Kyrre 99 50
        //Heal - Solmyr - 10
        //Recharge - Solmyr - 50
        //TakeDamage - Kyrre - 66 - Orc
        //CastSpell - Kyrre - 15 - ViewEarth
        //End

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] hero = scanner.nextLine().split("\\s+");
            heroes.putIfAbsent(hero[0], new ArrayList<>());
            heroes.get(hero[0]).add(Integer.parseInt(hero[1])); // Hit Points .get(0)
            heroes.get(hero[0]).add(Integer.parseInt(hero[2])); // Mana Points .get(1)
        }

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] command = input.split(" - ");
            String name = command[1];
            int num = Integer.parseInt(command[2]);

            switch (command[0]) {
                case "CastSpell":
                    if (heroes.get(name).get(1) - num >= 0) {
                        heroes.get(name).set(1, heroes.get(name).get(1) - num);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                name, command[3], heroes.get(name).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, command[3]);
                    }
                    break;
                case "TakeDamage":
                    if (heroes.get(name).get(0) - num > 0) {
                        heroes.get(name).set(0, heroes.get(name).get(0) - num);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                name, num, command[3], heroes.get(name).get(0));
                    } else {
                        heroes.remove(name);
                        System.out.printf("%s has been killed by %s!%n", name, command[3]);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(command[2]);
                    if (heroes.get(name).get(1) + amount > 200) {
                        amount = 200 - heroes.get(name).get(1);
                        heroes.get(name).set(1, 200);
                    } else {
                        heroes.get(name).set(1, heroes.get(name).get(1) + amount);
                    }
                    System.out.printf("%s recharged for %d MP!%n", name, amount);
                    break;
                case "Heal":
                    amount = Integer.parseInt(command[2]);
                    if (heroes.get(name).get(0) + amount > 100) {
                        amount = 100 - heroes.get(name).get(0);
                        heroes.get(name).set(0, 100);
                    } else {
                        heroes.get(name).set(0, heroes.get(name).get(0) + amount);
                    }
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                    break;
            }
            input = scanner.nextLine();
        }

        heroes
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue().get(0).compareTo(a.getValue().get(0));
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(h -> {
                    System.out.println(h.getKey());
                    System.out.println(String.format("  HP: %d", h.getValue().get(0)));
                    System.out.println(String.format("  MP: %d", h.getValue().get(1)));
                });
    }
}