package MapsLambdaStreamAPI.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class Maps_Lab_01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 8 2 2 8 2

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> values = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            double key = nums[i];
            if (!values.containsKey(key)){
                values.put(key, 1);
            } else {
                values.put(key, values.get(key) + 1);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        for (Map.Entry<Double, Integer> d : values.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(d.getKey()), d.getValue());
        }
    }
}