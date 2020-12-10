package MidExam.MidExam10Dec19Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookShelf = scanner.nextLine();
        List<String> books = Arrays.stream(bookShelf.split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"Done".equals(input)) {
            String[] command = input.split(" \\| ");

            switch (command[0]) {
                case "Add Book":
                    if (!books.contains(command[1])) books.add(0,command[1]);
                    break;
                case "Take Book":
                    if (books.contains(command[1])) books.remove(command[1]);
                    break;
                case "Swap Books":
                    if (books.contains(command[1]) && books.contains(command[2])) {
                        int index1 = books.indexOf(command[1]);
                        int index2 = books.indexOf(command[2]);
                        books.set(index1, command[2]);
                        books.set(index2, command[1]);
                    }
                    break;
                case "Insert Book":
                    books.add(command[1]);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < books.size()) System.out.println(books.get(index));
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", books));
    }
}
