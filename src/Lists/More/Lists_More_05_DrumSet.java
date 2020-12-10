package Lists.More;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_More_05_DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < drumSet.size(); i++) {
            temp.add(drumSet.get(i));
        }

        while (true){
            String input = scanner.nextLine();
            if ("Hit it again, Gabsy!".equals(input)) {
                break;
            }
            int power = Integer.parseInt(input);
            double price = 0;
            for (int i = 0; i < temp.size(); i++) {
                temp.set(i,temp.get(i) - power);
                if (temp.get(i) <= 0){
                    price = drumSet.get(i) * 3;
                    if (savings - price < 0) {
                        temp.remove(i);
                        drumSet.remove(i);
                        i -= 1;
                    } else {
                        temp.set(i,drumSet.get(i));
                        savings -= price;
                    }
                }
            }
        }

        for (int t : temp) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
