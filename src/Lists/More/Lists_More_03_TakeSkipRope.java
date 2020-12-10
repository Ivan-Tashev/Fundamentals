package Lists.More;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists_More_03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> nums = new ArrayList<>();
        List<String> signs = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                nums.add(Integer.parseInt(input.charAt(i) + ""));
            } else {
                signs.add(input.charAt(i) + "");
            }
        }
       // System.out.println(nums.toString());
       // System.out.println(signs.toString());
        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) take.add(nums.get(i));
            else skip.add(nums.get(i));
        }
        System.out.println(take.toString());
        System.out.println(skip.toString());

        List<String> result = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < take.size(); i++) {
            int toTake = take.get(i);
            int toSkip = skip.get(i);

            for (int j = counter; j < toTake + counter - 1; j++) {
                result.add(signs.get(j));
            }
            counter = counter + toTake + toSkip;
        }

        for (String res : result) {
            System.out.print(res);
        }
    }
}
