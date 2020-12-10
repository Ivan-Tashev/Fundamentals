package FinalExam.FinalExam3Aug19Group2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExam_3Aug19Group2_03_BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Add:Mark:1000:5 Add:Clark:1000:3 Attack:Clark:Mark:500 Add:Allison:2500:5 
        // Attack:Clark:Mark:300 Add:Charlie:4000:10 Attack:Clark:Mark:500 Results

        Map<String, int[]> people = new HashMap<>(); // int[0] health, int[1] energy
        String input = scanner.nextLine();
        while (!"Results".equals(input)) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add":
                    String name = command[1];
                    int health = Integer.parseInt(command[2]);
                    int energy = Integer.parseInt(command[3]);
                    if (people.containsKey(name)) {
                        people.get(name)[0] += health;
                    }
                    people.putIfAbsent(name, new int[]{health, energy});
                    break;
                case "Attack":
                    String attacker = command[1];
                    String defender = command[2];
                    int damage = Integer.parseInt(command[3]);
                    if (people.containsKey(attacker) && people.containsKey(defender)){
                        people.get(defender)[0] -= damage;
                        if (people.get(defender)[0] <= 0){
                            System.out.printf("%s was disqualified!%n", defender);
                            people.remove(defender);
                        }
                        people.get(attacker)[1] -= 1;
                        if (people.get(attacker)[1] == 0){
                            System.out.printf("%s was disqualified!%n", attacker);
                            people.remove(attacker);
                        }
                    }
                    break;
                case "Delete":
                    if (people.containsKey(command[1])){
                        people.remove(command[1]);
                    } else if ("All".equals(command[1])){
                        people = new HashMap<>();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("People count: %d%n", people.size());
        people
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue()[0] - a.getValue()[0];
                    if (res == 0) res = a.getKey().compareTo(b.getKey());
                    return res;
        })
                .forEach(p -> System.out.printf("%s - %d - %d%n",
                        p.getKey(), p.getValue()[0], p.getValue()[1]));
    }
}