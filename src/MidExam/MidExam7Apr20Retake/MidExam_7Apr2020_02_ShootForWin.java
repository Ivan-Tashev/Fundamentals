package MidExam.MidExam7Apr20Retake;

import java.util.Arrays;
import java.util.Scanner;

public class MidExam_7Apr2020_02_ShootForWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input =scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        String indexString = scanner.nextLine();
        int countShotTargets = 0;

        while (!indexString.equals("End")){
            int index = Integer.parseInt(indexString);
            if (index > nums.length -1) {
                indexString = scanner.nextLine();
                continue;
            }
            int cur = nums[index];
            if (0 <= index) {
                nums[index] = -1;
                countShotTargets++;
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) continue;
                else if (nums[i] > cur) nums[i] -= cur;
                else if (nums[i] <= cur) nums[i] += cur;
            }
            indexString = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShotTargets);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
