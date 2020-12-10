package MapsLambdaStreamAPI.Exercise;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps_Exr_10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pesho-Java-84
        //Gosho-C#-70
        //Gosho-C#-84
        //Kiro-C#-94
        //Kiro-banned
        //exam finished

        HashMap<String, Integer> students = new HashMap<>();
        TreeMap<String, Integer> languages = new TreeMap<>();
        String input = scanner.nextLine();
        while (!"exam finished".equals(input)) {
            String[] command = input.split("-");

            if ("banned".equals(command[1])) {
                // ban user - "Kiro-banned"
                String student = command[0];
                if (students.containsKey(student)){
                    students.remove(student);
                }
                input = scanner.nextLine();
                continue;
            }

            String name = command[0];
            String language = command[1];
            int points = Integer.parseInt(command[2]);

            students.putIfAbsent(name, points);
            if (students.get(name) < points) {
                students.put(name, points);
            }

            languages.putIfAbsent(language, 0);
            languages.put(language, languages.get(language) + 1);

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        students
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(s -> System.out.println(String.format("%s | %d",
                        s.getKey(), s.getValue())));
        System.out.println("Submissions:");
        languages
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(l -> System.out.println(String.format("%s - %d",
                        l.getKey(), l.getValue())));
    }
}