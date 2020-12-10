package TextProcessing.Lab;

import java.util.Scanner;

public class TextProcessing_Lab_03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ice
        //kicegiciceeb

//        while (text.contains(toRemove)){
//            text = text.replaceAll(toRemove, "");
//        }
//        System.out.println(text);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(toRemove)) {
            int startIndex = text.indexOf(toRemove);

            text = text.substring(0, startIndex) + text.substring(startIndex + toRemove.length());
        }
        System.out.println(text);
    }
}