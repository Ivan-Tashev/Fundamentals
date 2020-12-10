package MidExam.MidExam29Feb20Group1;

import java.util.Scanner;

public class MidExam_29Feb20_01_NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int people = Integer.parseInt(scanner.nextLine());

        int perHour = a + b + c;
        int answered = 0;
        int hours = 0;

        while (answered < people){
            hours++;
            if (hours % 4 == 0) continue;
            answered += perHour;
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
