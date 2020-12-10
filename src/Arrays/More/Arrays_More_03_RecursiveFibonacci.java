package Arrays.More;

import java.util.Scanner;

public class Arrays_More_03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1) System.out.println(1);
        else {
            int[] fib = new int[n];
            fib[0] = 1;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.print(fib[n - 1]);
        }
    }
}
