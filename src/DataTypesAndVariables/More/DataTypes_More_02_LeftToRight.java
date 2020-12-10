package DataTypesAndVariables.More;

import java.util.Scanner;

public class DataTypes_More_02_LeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            long[] arr = new long[input.length];
            for (int j = 0; j < input.length; j++) {
                arr[j] = Long.parseLong(input[j]);
            }

            long curNum1 = arr[0];
            long sum1 = 0;
            for (int j = 0; j < input[0].length(); j++) {
                sum1 += curNum1 % 10;
                curNum1 /= 10;
            }

            long curNum2 = arr[1];
            long sum2 = 0;
            for (int j = 0; j < input[1].length(); j++) {
                sum2 += curNum2 % 10;
                curNum2 /= 10;
            }

            if (sum1 > sum2) System.out.println(sum1);
            else System.out.println(sum2);

        }
    }
}
