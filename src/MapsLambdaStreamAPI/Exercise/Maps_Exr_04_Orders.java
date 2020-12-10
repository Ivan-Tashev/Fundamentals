package MapsLambdaStreamAPI.Exercise;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Maps_Exr_04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Beer 2.20 100
        //IceTea 1.50 50
        //NukaCola 3.30 80
        //Water 1.00 500
        //buy

        LinkedHashMap<String, double[]> drinks = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"buy".equals(input)) {
            String[] product = input.split("\\s+");
            String name = product[0];
            double[] priceQty = new double[]{Double.parseDouble(product[1]),
                    Double.parseDouble(product[2])};

            if (!drinks.containsKey(name)) {
                drinks.putIfAbsent(name, priceQty);
            } else {
                double[] qty = drinks.get(name);
                qty[0] = priceQty[0];
                qty[1] = qty[1] + priceQty[1];
                drinks.put(name, qty);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, double[]> entry : drinks.entrySet()) {
            double sum = entry.getValue()[0] * entry.getValue()[1];
            System.out.printf("%s -> %.2f%n", entry.getKey(), sum);
        }
    }
}
