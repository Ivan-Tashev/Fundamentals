package ObjectsAndClasses.Exercise.VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String[] data = input.split("\\s+");
            Vehicle vehicle;
            if ("truck".equals(data[0])) {
                vehicle = new Vehicle("Truck", data[1], data[2], Integer.parseInt(data[3]));
               // vehicles.add(vehicle);
            } else {
                vehicle = new Vehicle("Car", data[1], data[2], Integer.parseInt(data[3]));
            }
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)){
            for (Vehicle v : vehicles) {
                if (v.getModel().equals(model)) {
                    System.out.println(v.printModel(v));
                    break;
                }
            }
            model = scanner.nextLine();
        }

        double carHP = printHorsePower(vehicles, "Car");
        System.out.printf("Cars have average horsepower of: %.2f.%n", carHP);

        double truckHP = printHorsePower(vehicles, "Truck");
        System.out.printf("Trucks have average horsepower of: %.2f.", truckHP);
    }

    public static double printHorsePower (List<Vehicle> vehicles, String type){
        double sum = 0.;
        int counter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                sum += vehicle.getHorsepower();
                counter++;
            }
        }
        if (counter == 0) return 0;
        return sum / counter;
    }
}