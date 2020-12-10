package TextProcessing.More;

import java.util.Scanner;

public class TextProcessing_More_05_HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SoftUni Article
        //Some content of the SoftUni article
        //some comment
        //more comment
        //last comment
        //end of comments

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.println("<h1>");
        System.out.printf("    %s%n", title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.printf("    %s%n", content);
        System.out.println("</article>");

        String comment = scanner.nextLine();
        while (!"end of comments".equals(comment)){
            System.out.println("<div>");
            System.out.printf("    %s%n", comment);
            System.out.println("</div>");
            comment = scanner.nextLine();
        }
    }
}