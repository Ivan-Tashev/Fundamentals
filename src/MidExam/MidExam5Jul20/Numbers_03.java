package MidExam.MidExam5Jul20;

import java.net.CookieHandler;
import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        double sum = 0.;
        for (int num : nums) {
            sum += num;
        }
        double average = sum / nums.length;

        List<Integer> top5 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                top5.add(nums[i]);
            }
        }

        Collections.sort(top5, Collections.reverseOrder());

        if (top5.isEmpty()) {
            System.out.println("No");
        } else if (top5.size() < 5) {
            System.out.println(String.join(" ", String.valueOf(top5))
                    .replaceAll("[\\[\\],]", ""));
        } else {
            for (int i = 0; i < 4; i++) {
                System.out.print(top5.get(i) + " ");
            }
            System.out.println(top5.get(4));
        }
    }
}