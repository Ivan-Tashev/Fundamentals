package MidExam.MidExam2Nov19Group1;

import java.util.Scanner;

public class BiscuitsFactory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsDayWorker = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competitor30days = Integer.parseInt(scanner.nextLine());

        double factory30days = biscuitsDayWorker * workers * 30;
        factory30days = factory30days - (Math.floor(10 * biscuitsDayWorker * workers) * 0.25);
        System.out.printf("You have produced %.0f biscuits for the past month.%n", factory30days);

        double more = 0.;
        double less = 0.;
        if (factory30days > competitor30days) {
            more = (factory30days - competitor30days) * 1. / competitor30days;
            System.out.printf("You produce %.2f percent more biscuits.", more * 100);
        } else {
            less = (competitor30days - factory30days) * 1. / competitor30days;
            System.out.printf("You produce %.2f percent less biscuits.", less * 100);
        }
    }
}