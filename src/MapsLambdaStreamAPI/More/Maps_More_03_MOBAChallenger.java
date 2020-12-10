package MapsLambdaStreamAPI.More;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_More_03_MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pesho -> Adc -> 400
        //Gosho -> Jungle -> 300
        //Stamat -> Mid -> 200
        //Stamat -> Support -> 250
        //Season end

        Map<String, HashMap<String, Integer>> players = new HashMap<>();

        String input = scanner.nextLine();
        while (!"Season end".equals(input)) {

            if (input.contains("->")) {
                String[] line = input.split(" -> ");
                String name = line[0];
                String position = line[1];
                int skill = Integer.parseInt(line[2]);

                players.putIfAbsent(name, new HashMap<>());
                players.get(name).putIfAbsent(position, skill);
                if (players.get(name).get(position) < skill) {
                    players.get(name).put(position, skill);
                }

            } else if (input.contains(" vs ")) {
                String[] line = input.split(" vs ");
                String p1 = line[0];
                String p2 = line[1];

                if (players.containsKey(p1) && players.containsKey(p2)) {
                    String temp = players.get(p1)
                            .keySet()
                            .stream()
                            .toString();
                    for (int i = 0; i < players.get(p2).size(); i++) {

                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
