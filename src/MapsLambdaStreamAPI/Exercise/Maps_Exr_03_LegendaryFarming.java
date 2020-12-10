package MapsLambdaStreamAPI.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps_Exr_03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3 Motes 5 stones 5 Shards
        //6 leathers 255 fragments 7 Shards

        TreeMap<String, Integer> items = new TreeMap<>() {{
            put("shards", 0);
            put("fragments", 0);
            put("motes", 0);
        }};
        TreeMap<String, Integer> junk = new TreeMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int qty = Integer.parseInt(tokens[i]);
                String type = tokens[i + 1].toLowerCase();
                if (items.containsKey(type)) {
                    addItem(items, type, qty);
                    isObtained = hasLegendary(items, type);
                    if (isObtained) break;
                } else {
                    addItem(junk, type, qty);
                }
            }
        }
        // println items ordered by qty, then by name asc
        items.entrySet()
                .stream()
                .sorted((q1, q2) -> Integer.compare(q2.getValue(), q1.getValue()))
                .forEach(q -> System.out.println(q.getKey() + ": " + q.getValue()));

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean hasLegendary(Map<String, Integer> items, String type) {
        int count = items.get(type);
        if (count >= 250) {
            items.put(type,count -250);
            switch (type) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    return true;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    return true;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    return true;
            }
        }
        return false;
    }

    public static void addItem(Map<String, Integer> map, String key, int value) {
        map.putIfAbsent(key, 0);
        int count = map.get(key);
        map.put(key, count + value);
    }
}