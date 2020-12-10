package TextProcessing.More;

import java.util.Scanner;

public class TextProcessing_More_02_ASCIISumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //.
        //@
        //dsg12gr5653feee5

        char sym1 = scanner.nextLine().charAt(0);
        char sym2 = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int sum =0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > sym1 && text.charAt(i) < sym2){
                sum += text.charAt(i);
            }
        }
        System.out.println(sum);
    }
}