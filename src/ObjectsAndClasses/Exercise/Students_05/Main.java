package ObjectsAndClasses.Exercise.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student student = new Student(input[0], input[1], Double.parseDouble(input[2]));
            students.add(student);
        }

        students
                .stream()
                .sorted((a, b) -> b.getGrade().compareTo(a.getGrade()))
                .forEach(s -> System.out.println(s));
    }
}
