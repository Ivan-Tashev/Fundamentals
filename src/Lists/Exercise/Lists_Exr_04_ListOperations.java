package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Add":
                    nums.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (index < 0 || index > nums.size() - 1) System.out.println("Invalid index");
                    else nums.add(index, Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(command[1]);
                    if (indexRemove < 0 || indexRemove > nums.size() - 1) System.out.println("Invalid index");
                    else nums.remove(indexRemove);
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    if (command[1].equals("left")){
                        for (int i = 0; i < count; i++) {
                            int temp = nums.get(0);
                            nums.remove(0);
                            nums.add(temp);
                        }
                    } else if (command[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int temp = nums.get(nums.size() - 1);
                            nums.remove(nums.size() - 1);
                            nums.add(0,temp);
                        }
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
