package ObjectsAndClasses.Exercise.OrderByAge_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayList<Order> people = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] data = input.split("\\s+");
            Order order = new Order(data[0], data[1], Integer.parseInt(data[2]));
            people.add(order);
            input = scanner.nextLine();
        }

        people
                .stream()
                .sorted((a, b) -> a.getAge() - (b.getAge()))
                .forEach(o -> System.out.println(o));
    }
}
