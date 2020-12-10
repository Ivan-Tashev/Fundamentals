package MapsLambdaStreamAPI.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Exr_01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') continue;
            if (chars.containsKey(input.charAt(i))) {
                chars.put(input.charAt(i),chars.get(input.charAt(i)) + 1);
            } else {
                chars.put(input.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}