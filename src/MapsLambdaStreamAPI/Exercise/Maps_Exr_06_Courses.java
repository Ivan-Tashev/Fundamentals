package MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class Maps_Exr_06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Programming Fundamentals : John Smith
        //Programming Fundamentals : Linda Johnson
        //JS Core : Will Wilson
        //Java Advanced : Harrison White
        //end

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] line = input.split(" : ");
            String course = line[0];
            String student = line[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);

            input = scanner.nextLine();
        }

        courses
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int first = a.getValue().size();
                    int second = b.getValue().size();
                    return Integer.compare(second, first);
                })
                .forEach(c -> {
                    System.out.println(String.format("%s: %d",
                            c.getKey(),
                            c.getValue().size()));
                    c.getValue()
                            .stream()
                            .sorted((String::compareTo))
                            .forEach(s -> System.out.println(String.format("-- %s", s)));
                });
    }
}