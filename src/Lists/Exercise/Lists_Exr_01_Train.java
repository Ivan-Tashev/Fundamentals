package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        // 32 54 21 12 4 0 23
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        //75

        String command = scanner.nextLine();

        while (!"end".equals(command)){
            String[] input = command.split(" ");
            if ("Add".equals(input[0])){
                train.add(Integer.parseInt(input[1]));
            } else {
               int passengers = Integer.parseInt(input[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passengers <= maxCapacity){
                        train.set(i,train.get(i) + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int n:train) {
            System.out.print(n + " ");
        }
    }
}
