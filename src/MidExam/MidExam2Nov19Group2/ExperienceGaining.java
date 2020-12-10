package MidExam.MidExam2Nov19Group2;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experience = Double.parseDouble(scanner.nextLine());
        if (experience == 0.){
            System.out.println("Player successfully collected his needed experience for 0 battles.");
            return;
        }
        int numBattles = Integer.parseInt(scanner.nextLine());
        if (numBattles == 0) {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experience);
            return;
        }
        int current = 0;

        for (int i = 1; i <= numBattles; i++) {
            double experinceGained = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) experinceGained = experinceGained * 1.15;
            if (i % 5 == 0) experinceGained = experinceGained - (experinceGained * 0.1);
            current += experinceGained;
            if (current >= experience) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        double diff = experience - current;
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", diff);
    }
}