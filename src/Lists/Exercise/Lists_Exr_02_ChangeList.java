package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!"end".equals(line)) {
            String[] input = line.split("\\s+");

            switch (input[0]) {
                case "Delete":
                    for (int i = 0; i < nums.size(); i++) {
                        if (Integer.valueOf(input[1]).equals(nums.get(i))) {
                            nums.remove(Integer.valueOf(input[1]));
                            i = i - 1;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    if (index >= 0 && index < nums.size())
                        nums.add(index, Integer.parseInt(input[1]));
            }
            line = scanner.nextLine();
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}