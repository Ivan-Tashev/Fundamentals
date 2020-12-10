package MapsLambdaStreamAPI.Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Map<Integer, String> products = new HashMap<>();
        products.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int res = e2.getValue().compareTo(e1.getValue()); // compare by Values
                    if (res == 0)
                        res = e1.getKey().compareTo(e2.getKey()); // compare by Key
                    return res;
                })
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        Map<String, ArrayList<Integer>> arr = new HashMap<>();
        arr.entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getKey().compareTo(b.getKey()) == 0) {
                        int sum1 = a.getValue().stream().mapToInt(x -> x).sum();
                        int sum2 = b.getValue().stream().mapToInt(x -> x).sum();
                        return sum1 - sum2;
                    }
                    return b.getKey().compareTo(a.getKey());
                })
                .forEach(pair -> {
                    System.out.println("Key: " + pair.getKey());
                    System.out.print("Value: ");
                    pair.getValue().sort((a, b) -> a.compareTo(b));
                    for (int num : pair.getValue()) {
                        System.out.printf("%d ", num);
                    }
                    System.out.println();
                });
    }
}
