package MidExam.MidExam29Feb20Group1;

import java.util.Arrays;
import java.util.Scanner;

public class MidExam_29Feb20_03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 6 @ 6 @ 6
        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String[] command = scanner.nextLine().split(" ");
        int lastPosition = 0;
        while (!"Love!".equals(command[0])) {
            int jump = Integer.parseInt(command[1]) + lastPosition;  // 1
            if (jump >= houses.length) {
                jump = 0;
            }
            if (houses[jump] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", jump);
                lastPosition = jump;
            } else {
                houses[jump] -= 2;
                if (houses[jump] == 0) System.out.printf("Place %d has Valentine's day.%n", jump);
                lastPosition = jump;
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        boolean valentine = true;
        int failures = 0;
        for (int house : houses) {
            if (house != 0) {
                valentine = false;
                failures++;
            }
        }
        if (valentine) System.out.println("Mission was successful.");
        else System.out.printf("Cupid has failed %d places.", failures);
    }
}
