package MidExam.MidExam29Feb20Group2;

import java.util.Scanner;

public class MidExam_29Feb20Group2_01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double totalBonus = 0.;
        double maxBonus = 0;
        int attendance = 0;
        for (int i = 0; i < students; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            totalBonus = (count * 1.) / lectures * (5 + bonus);

            if (totalBonus >= maxBonus) {
                maxBonus = totalBonus;
                attendance = count;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", attendance);
    }
}
