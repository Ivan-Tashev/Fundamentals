package MidExam.MidExam10Mar19Group1;

import java.util.Scanner;

public class SpringVacationTrip_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodPersonDay = Double.parseDouble(scanner.nextLine());
        double nightPerson = Double.parseDouble(scanner.nextLine());

        if (people > 10) {
            nightPerson *= 0.75;
        }
        double totalFood = days * people * foodPersonDay;
        double totalHotel = days * people * nightPerson;
        double currentCost = totalFood + totalHotel;

        for (int i = 1; i <= days ; i++) {
            double distanceTraveledPerDay = Double.parseDouble(scanner.nextLine());

            currentCost = currentCost + (distanceTraveledPerDay * fuelPerKm);
            if (i % 3 == 0 || i % 5 == 0){
                currentCost = currentCost + (currentCost * 0.4);
            }
            if (i % 7 == 0) {
                currentCost = currentCost - (currentCost / people);
            }
            if (currentCost > budget) {
                System.out.print("Not enough money to continue the trip. ");
                break;
            }
        }
        if (currentCost <= budget) {
            double diff = budget - currentCost;
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", diff);
        } else {
            double diff = currentCost - budget;
            System.out.printf("You need %.2f$ more.", diff);
        }
    }
}
