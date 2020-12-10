package MidExam.MidExam16Apr19Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterShopping_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shops = Arrays.stream((scanner.nextLine().split("\\s+")))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "Include":
                    shops.add(command[1]);
                    break;
                case "Visit":
                    int num = Integer.parseInt(command[2]);
                    if (num >= shops.size()) {
                        continue;
                    } else if ("first".equals(command[1])) {
                        for (int j = 0 ; j < num; j++) {
                            shops.remove(0);
                        }
                    } else if ("last".equals(command[1])) {
                        int a = shops.size() - num;
                        for (int j = shops.size() - 1 - num; j < shops.size(); j++) {
                            shops.remove(a);
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if ((index1 >= 0 && index1 < shops.size())
                            && (index2 >= 0 && index2 < shops.size())) {
                        String temp = shops.get(index1);
                        shops.set(index1, shops.get(index2));
                        shops.set(index2, temp);
                    }
                    break;
                case "Place":
                    int index = Integer.parseInt(command[2]) + 1;
                    if (index >= 0 && index < shops.size()){
                        shops.add(index, command[1]);
                    }
                    break;
            }
        }
        System.out.println("Shops left:");
        System.out.println(String.join(" ", shops));
    }
}