package MidExam.MidExam30Jun19Group2;

import java.util.Scanner;

public class GiftboxCoverage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side = Double.parseDouble(scanner.nextLine());
        int sheets = Integer.parseInt(scanner.nextLine());
        double paper = Double.parseDouble(scanner.nextLine());

        double totalArea = (side * side) * 6;

        double totalPaper = 0.;
        for (int i = 1; i <= sheets; i++) {
            if (i % 3 == 0){
                totalPaper += (paper * 0.25);
                continue;
            }
            totalPaper += paper;
        }

        double percentage = totalPaper / totalArea * 100;
        System.out.printf("You can cover %.2f%% of the box.", percentage);
    }
}