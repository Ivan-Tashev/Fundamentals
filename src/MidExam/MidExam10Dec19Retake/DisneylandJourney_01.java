package MidExam.MidExam10Dec19Retake;

import java.util.Scanner;

public class DisneylandJourney_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int journey = Integer.parseInt(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double saved = 0.;

        for (int i = 1; i <= months; i++) {
            if (i % 2 == 1 && i > 1) saved = saved - (saved * 0.16);
            if (i % 4 == 0) saved = saved + (saved * 0.25);
            saved += journey * 0.25;
        }

        if (saved >= journey) {
            double diff = saved - journey;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", diff);
        } else {
            double needed = journey - saved;
            System.out.printf("Sorry. You need %.2flv. more.", needed);
        }
    }
}
