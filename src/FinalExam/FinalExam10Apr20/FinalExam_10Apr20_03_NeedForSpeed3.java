package FinalExam.FinalExam10Apr20;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExam_10Apr20_03_NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //Audi A6|38000|62
        //Mercedes CLS|11000|35
        //Volkswagen Passat CC|45678|5
        //Drive : Audi A6 : 543 : 47
        //Drive : Mercedes CLS : 94 : 11
        //Drive : Volkswagen Passat CC : 69 : 8
        //Refuel : Audi A6 : 50
        //Revert : Mercedes CLS : 500
        //Revert : Audi A6 : 30000
        //Stop

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, int[]> cars = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            cars.putIfAbsent(input[0], new int[2]);
            cars.get(input[0])[0] = Integer.parseInt(input[1]);
            cars.get(input[0])[1] = Integer.parseInt(input[2]);
        }

        String line = scanner.nextLine();
        while (!"Stop".equals(line)) {
            String[] command = line.split(" : ");
            String car = command[1];

            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);
                    if (fuel > cars.get(car)[1]) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(car)[0] += distance;
                        cars.get(car)[1] -= fuel;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                car, distance, fuel);
                    }
                    if (cars.get(car)[0] >= 100000) {
                        cars.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(command[2]);
                    int availableFuel = cars.get(car)[1];
                    if (availableFuel + fuel > 75) {
                        fuel = 75 - availableFuel;
                        cars.get(car)[1] = 75;
                    } else {
                        cars.get(car)[1] += fuel;
                    }
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                    break;
                case "Revert":
                    int km = Integer.parseInt(command[2]);
                    if (cars.get(car)[0] - km < 10000) {
                        cars.get(car)[0] = 10000;
                    } else {
                        cars.get(car)[0] -= km;
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, km);
                    }
                    break;

            }
            line = scanner.nextLine();
        }
        //Volkswagen Passat CC -> Mileage: 45678 kms, Fuel in the tank: 5 lt.
        //Mercedes CLS -> Mileage: 10594 kms, Fuel in the tank: 24 lt.
        //Audi A6 -> Mileage: 10000 kms, Fuel in the tank: 65 lt.

        cars
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = b.getValue()[0] - a.getValue()[0];
                    if (res == 0) {
                        res = a.getKey().compareTo(b.getKey());
                    }
                    return res;
                })
                .forEach(c -> System.out.println(
                        String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.",
                        c.getKey(), c.getValue()[0], c.getValue()[1])));
    }
}