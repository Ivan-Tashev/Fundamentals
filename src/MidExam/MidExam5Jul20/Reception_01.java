package MidExam.MidExam5Jul20;

import java.util.Scanner;

public class Reception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count1hour = Integer.parseInt(scanner.nextLine());
        int count2hour = Integer.parseInt(scanner.nextLine());
        int count3hour = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int processed = 0;
        int hour = 0;

        while (processed < students) {
            hour++;
            if (hour % 4 == 0) {
                continue;
            }
            processed += count1hour + count2hour + count3hour;
        }
        System.out.printf("Time needed: %dh.", hour);
    }
}