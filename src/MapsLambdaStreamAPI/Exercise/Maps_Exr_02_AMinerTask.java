package MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Exr_02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"stop".equals(input)){
            int qty = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)){
                resources.put(input,resources.get(input) + qty);
            } else {
                resources.put(input,qty);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //resources
        //        .forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}