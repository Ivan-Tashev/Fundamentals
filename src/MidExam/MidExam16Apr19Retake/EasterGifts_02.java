package MidExam.MidExam16Apr19Retake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasterGifts_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gifts = (scanner.nextLine().split("\\s+"));

        String input = scanner.nextLine();
        while (!"No Money".equals(input)) {
            String[] command = input.split("\\s+");
            String gift = command[1];

            switch (command[0]) {
                case "OutOfStock":
                    for (int i = 0; i < gifts.length; i++) {
                        if (gift.equals(gifts[i])){
                            gifts[i] = "None";
                        }
                    }
                    break;
                case "Required":
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index < gifts.length) {
                        gifts[index] = gift;
                    }
                    break;
                case "JustInCase":
                    gifts[gifts.length - 1] = gift;
                    break;
            }
            input = scanner.nextLine();
        }

        List<String> availableGifts = new ArrayList<>();
        for (String g : gifts) {
            if (!"None".equals(g)){
                availableGifts.add(g);
            }
        }
        System.out.println(String.join(" ", availableGifts));
    }
}