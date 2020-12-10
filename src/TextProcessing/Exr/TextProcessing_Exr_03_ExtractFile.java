package TextProcessing.Exr;

import java.util.Scanner;

public class TextProcessing_Exr_03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // C:\Internal\training-internal\Template.pptx

        String path = scanner.nextLine();
        int slash = path.lastIndexOf("\\");
        int dot = path.lastIndexOf(".");

        System.out.printf("File name: %s%n", path.substring(slash + 1,dot));
        System.out.printf("File extension: %s", path.substring(dot + 1));
    }
}