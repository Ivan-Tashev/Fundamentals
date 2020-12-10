package TextProcessing.More;

import java.util.Scanner;

public class TextProcessing_More_01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2
        //Here is a name @George| and an age #18*
        //Another name @Billy| #35* is his age

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int indexStartName = line.indexOf('@');
            int indexEndName = line.indexOf('|');
            int indexStartAge = line.indexOf('#');
            int indexEndAge = line.indexOf('*');

            String name = line.substring(indexStartName + 1, indexEndName);
            String age = line.substring(indexStartAge + 1, indexEndAge);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}