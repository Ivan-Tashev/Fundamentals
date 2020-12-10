package ObjectsAndClasses.Lab.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentPart = input.split(" ");
            int age = Integer.parseInt(studentPart[2]);

            Student student = new Student(studentPart[0], studentPart[1], age, studentPart[3]);
            students.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getHometown().equals(city)){
                System.out.println(current.getString());
            }
        }

        // Stream API on object students from List<Student> students
        // students.stream()
        //        .filter(s -> s.getHometown().equals(city))
        //        .forEach(s -> System.out.println(s.getString()));
    }
}
