package MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class Maps_Exr_07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //5
        //John
        //5.5
        //John
        //4.5
        //Alice

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students
                .entrySet()
                .stream()
                .filter(s -> s
                        .getValue()
                        .stream()
                        .mapToDouble(d -> Double.valueOf(d))
                        .average()
                        .getAsDouble() >= 4.5)
                .sorted((s1, s2) -> {
                    double first = s1
                            .getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    double second = s2
                            .getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));

//        students
//                .entrySet()
//                .stream()
//                .filter(a -> a
//                          .getValue()
//                          .stream()
//                          .mapToDouble(Double::doubleValue)
//                          .average()
//                          .getAsDouble() >= 4.5)
//                .sorted((a, b) -> b.getKey().compareTo(a.getKey()))
//                .forEach(a -> System.out.printf("%s -> %.2f%n",
//                          a.getKey(),
//                          a.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()));

    }
}