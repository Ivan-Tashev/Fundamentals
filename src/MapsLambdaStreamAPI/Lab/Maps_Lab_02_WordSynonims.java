package MapsLambdaStreamAPI.Lab;

import java.util.*;

public class Maps_Lab_02_WordSynonims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(syn);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),
                    String.join(", ", entry.getValue()));
        }
    }
}