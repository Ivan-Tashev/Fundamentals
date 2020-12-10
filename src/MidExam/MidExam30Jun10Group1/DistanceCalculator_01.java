package MidExam.MidExam30Jun10Group1;

import java.util.Scanner;

public class DistanceCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsMade = Integer.parseInt(scanner.nextLine());
        double stepCentimeters = Double.parseDouble(scanner.nextLine());
        int distanceMeters = Integer.parseInt(scanner.nextLine());

        double covered = 0.;

        distanceMeters = distanceMeters * 100;
        for (int i = 1; i <= stepsMade ; i++) {
            if (i % 5 == 0){
                covered += stepCentimeters * 0.7;
                continue;
            }
            covered += stepCentimeters;
        }
        System.out.printf("You travelled %.2f%% of the distance!",
                covered / distanceMeters * 100);
    }
}