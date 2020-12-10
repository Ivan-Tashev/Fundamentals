package Methods.Exercise;

import java.util.Scanner;

public class Methods_Exr_07_NxNMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < n; j++) { // colomns == elements per row
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
