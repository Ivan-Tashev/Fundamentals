package MapsLambdaStreamAPI.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Maps_Lab_05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a)) // sort Descending
                .limit(3) // limit the filtered results
                .map(n -> n.toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}