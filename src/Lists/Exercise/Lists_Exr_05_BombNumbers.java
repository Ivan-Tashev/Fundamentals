package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] bombPower = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int bombNumber= bombPower[0];
        int power = bombPower[1];

        int powerSize = power * 2 + 1;

        for (int i = 0; i < nums.size(); i++) {
            if (bombNumber == nums.get(i)) { // finding bomb number
                int indexToRemove = i - power;
                for (int j = 0; j < powerSize; j++) {
                    if (indexToRemove >= nums.size()){
                        break;
                    }
                    if (indexToRemove < 0) {
                        powerSize += indexToRemove;
                        indexToRemove = 0;
                    }
                    nums.remove(indexToRemove);
                }
                i = -1;
            }
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }
}
