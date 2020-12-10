package ObjectsAndClasses.Exercise.OpinionPoll_03;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);
        }

        people
                .stream()
                .filter(p -> p.getAge() > 30) // filter by condition
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())) // sorting with .compareTo
                .forEach(p -> System.out.println(p.toString()));
    }
}