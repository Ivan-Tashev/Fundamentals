package Arrays.More;

import java.util.Scanner;

public class Arrays_More_02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine()); // 4

        int[] row1 = new int[]{1};
        System.out.println(row1[0]);
        int[] num = new int[]{1, 1};
        System.out.println(num[0] + " " + num[1]);
        for (int i = 2; i < rows; i++) {
            int[] temp = new int[i + 1]; // length = 3
            temp[0] = 1;
            temp[temp.length - 1] = 1;
            for (int j = 1; j < temp.length - 1; j++) {
                temp[j] = num[j - 1] + num[j];
            }
            for (int value : temp) {
                System.out.print(value + " ");
            }
            System.out.println();
            num = temp;
        }
    }
}
