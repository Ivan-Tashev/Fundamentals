package BasicSyntax.More;

import java.util.Scanner;

public class BasicSyntax_More_05_Massages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLetters; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 2) {
                System.out.print("a");
            } else if (num == 22) {
                System.out.print("b");
            } else if (num == 222) {
                System.out.print("c");
            } else if (num == 3) {
                System.out.print("d");
            } else if (num == 33) {
                System.out.print("e");
            } else if (num == 333) {
                System.out.print("f");
            } else if (num == 4) {
                System.out.print("g");
            } else if (num == 44) {
                System.out.print("h");
            } else if (num == 444) {
                System.out.print("i");
            } else if (num == 5) {
                System.out.print("j");
            } else if (num == 55) {
                System.out.print("k");
            } else if (num == 555) {
                System.out.print("l");
            } else if (num == 6) {
                System.out.print("m");
            } else if (num == 66) {
                System.out.print("n");
            } else if (num == 666) {
                System.out.print("o");
            } else if (num == 7) {
                System.out.print("p");
            } else if (num == 77) {
                System.out.print("q");
            } else if (num == 777) {
                System.out.print("r");
            } else if (num == 7777) {
                System.out.print("s");
            } else if (num == 8) {
                System.out.print("t");
            } else if (num == 88) {
                System.out.print("u");
            } else if (num == 888) {
                System.out.print("v");
            } else if (num == 9) {
                System.out.print("w");
            } else if (num == 99) {
                System.out.print("x");
            }  else if (num == 999) {
                System.out.print("y");
            }  else if (num == 9999) {
                System.out.print("z");
            } else if (num == 0) {
                System.out.print(" ");
            }
        }
    }
}
