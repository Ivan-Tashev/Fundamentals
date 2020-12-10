package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstCards.size() != 0 && secondCards.size() != 0) {

            if (firstCards.get(0) > secondCards.get(0)) {
                firstCards.add(firstCards.get(0));
                firstCards.remove(0);
                firstCards.add(secondCards.get(0));
                secondCards.remove(0);

            } else if (secondCards.get(0) > firstCards.get(0)) {
                secondCards.add(secondCards.get(0));
                secondCards.remove(0);
                secondCards.add(firstCards.get(0));
                firstCards.remove(0);

            } else {
                firstCards.remove(0);
                secondCards.remove(0);
            }

        }
        if (secondCards.size() == 0) {
            int sum = getSum(firstCards);
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = getSum(secondCards);
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }

    public static int getSum(List<Integer> firstCards) {
        int sum = 0;
        for (Integer firstCard : firstCards) {
            sum += firstCard;
        }
        return sum;
    }
}
