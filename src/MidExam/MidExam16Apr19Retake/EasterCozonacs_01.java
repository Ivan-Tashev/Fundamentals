package MidExam.MidExam16Apr19Retake;

import java.util.Scanner;

public class EasterCozonacs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());

        double eggs = kgFlour * 0.75;
        double literMilk = kgFlour * 1.25;

        double cake = kgFlour + eggs + (literMilk / 4);

        int cakeCount = 0;
        int eggsCount = 0;
        while (cake < budget){
            budget -= cake;
            cakeCount++;
            eggsCount += 3;
            if (cakeCount % 3 == 0) {
                eggsCount = eggsCount - (cakeCount - 2);
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs" +
                " and %.2fBGN left.", cakeCount, eggsCount, budget);
    }
}