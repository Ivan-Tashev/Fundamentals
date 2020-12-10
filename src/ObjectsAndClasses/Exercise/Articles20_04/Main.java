package ObjectsAndClasses.Exercise.Articles20_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // {title}, {content}, {author}
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }
            // {title} || {content} || {author}
        String command = scanner.nextLine();
        printResult(command, articles);
    }

    public static void printResult (String command, List<Article> articles) {
        switch (command) {
            case "title":
                articles
                        .stream()
                        .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "content":
                articles
                        .stream()
                        .sorted((a, b) -> a.getContent().compareTo(b.getContent()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "author":
                articles
                        .stream()
                        .sorted((a, b) -> a.getAuthor().compareTo(b.getAuthor()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
        }
    }
}
