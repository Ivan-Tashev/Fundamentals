package MidExam.MidExam10Mar19Group1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloFrance_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Clothes->43.30|Shoes->25.25|Clothes->36.52|Clothes->20.90|Accessories->15.60
        //120
        String[] items = scanner.nextLine().split("\\|");
        double budget = Double.parseDouble(scanner.nextLine());

        List<Double> buying = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {
            String[] item = items[i].split("->");

            if ("Clothes".equals(item[0]) && Double.parseDouble(item[1]) <= 50.){
                budget = getBudget(budget, buying, item);
            } else if ("Shoes".equals(item[0]) && Double.parseDouble(item[1]) <= 35.){
                budget = getBudget(budget, buying, item);
            } else if ("Accessories".equals(item[0]) && Double.parseDouble(item[1]) <= 20.50){
                budget = getBudget(budget, buying, item);
            }

        }
        double initialCost = 0.;
        double finalSellingValue = 0.;
        for (int i = 0; i < buying.size(); i++) {
            initialCost += buying.get(i);
            buying.set(i,buying.get(i) * 1.4);
            finalSellingValue += buying.get(i);
        }

        for (int i = 0; i < buying.size() - 1; i++) {
            Double b = buying.get(i);
            System.out.printf("%.2f ", b);
        }
        System.out.printf("%.2f%n", buying.get(buying.size() - 1));

        double profit = finalSellingValue - initialCost;
        System.out.printf("Profit: %.2f%n", profit);

        if (budget + finalSellingValue >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }

    }

    public static double getBudget(double budget, List<Double> buying, String[] item) {
        if (budget - Double.parseDouble(item[1]) >= 0) {
            budget -= Double.parseDouble(item[1]);
            buying.add(Double.parseDouble(item[1]));
        }
        return budget;
    }
}
