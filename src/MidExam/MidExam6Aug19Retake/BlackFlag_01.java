package MidExam.MidExam6Aug19Retake;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double sumPlunder = 0.;

        for (int i = 1; i <= days; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sumPlunder = sumPlunder + (plunderDay * 1.5);
                sumPlunder = sumPlunder - (sumPlunder * 0.3);
                continue;
            }

            if (i % 3 == 0) {
                sumPlunder = sumPlunder + (plunderDay * 1.5);
            } else if (i % 5 == 0) {
                sumPlunder += plunderDay;
                sumPlunder = sumPlunder - (sumPlunder * 0.3);
            } else {
                sumPlunder += plunderDay;
            }
        }

        if (sumPlunder >= expectedPlunder) System.out.printf
                ("Ahoy! %.2f plunder gained.", sumPlunder);
        else {
            double diff = sumPlunder / expectedPlunder;
            System.out.printf("Collected only %.2f%% of the plunder.", diff * 100);
        }
    }
}