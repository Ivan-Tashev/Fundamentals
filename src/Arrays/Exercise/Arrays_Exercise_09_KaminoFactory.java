package Arrays.Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Exercise_09_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = "";
        int[] maxOnesSequence = new int[length];
        int maxCount = 0;
        int maxIndex = 0;
        int maxSum = 0;
        int bestSample = 0;
        int sample = 1;

        while (!scanner.nextLine().equals("Clone them!")) {
            int[] dns = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();
            int index = 0;
            int count = 1;
            int sum = 0;
            boolean start = false;
            for (int i = 0; i < length; i++) {
                if (dns[i] == 1 && dns[i + 1] == 1) {
                    if (!start) {
                        index = i;
                    }
                    count++;
                    start = true;
                }
                if (i + 1 == dns.length - 1) break;
            }
            for (var item : dns) {
                sum += item;
            }
            if (count > maxCount) {
                maxCount = count;
                maxIndex = index;
                maxSum = sum;
                maxOnesSequence = dns;
                bestSample = sample;
            } else if (index < maxIndex) {
                maxCount = count;
                maxIndex = index;
                maxSum = sum;
                maxOnesSequence = dns;
                bestSample = sample;
            } else if (sum > maxSum) {
                maxCount = count;
                maxIndex = index;
                maxSum = sum;
                maxOnesSequence = dns;
                bestSample = sample;
            }
            sample++;
        }
        System.out.printf("Best DNA sample %s with sum: %d", bestSample, maxSum);
        for (int i = 0; i < length - 1; i++) {
            System.out.print(maxOnesSequence[i] + "!");
            System.out.println(maxOnesSequence[length - 1]);
        }
    }
}
