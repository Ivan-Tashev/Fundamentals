package MapsLambdaStreamAPI.Lab;

import java.util.*;

public class Maps_Lab_03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();

            if (output.containsKey(word)){
                output.put(word, output.get(word) + 1);
            } else {
                output.put(word,1);
            }
        }

        List<String> forPrint = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : output.entrySet()) {
            if (entry.getValue() % 2 == 1){
                forPrint.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", forPrint));
    }
}