package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists_Exr_03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+", 2);

            switch (input[1]) {
                case "is going!":
                    if (list.contains(input[0])){
                        System.out.printf("%s is already in the list!%n", input[0]);
                    } else {
                        list.add(input[0]);
                    }
                case "is not going!":
                    if (list.contains(input[0])){
                        list.remove(input[0]);
                    } else {
                        System.out.printf("%s is not in the list!%n", input[0]);
                    }
            }
        }

        for (String name : list) {
            System.out.println(name);
        }
    }
}