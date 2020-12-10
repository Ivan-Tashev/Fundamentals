package MapsLambdaStreamAPI.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps_Exr_08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SoftUni -> AA12345
        //SoftUni -> BB12345
        //Microsoft -> CC12345
        //HP -> BB12345
        //End

        TreeMap<String, List<String>> companies = new TreeMap<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] line = input.split(" -> ");
            String company = line[0];
            String id = line[1];

            companies.putIfAbsent(company, new ArrayList<>());
            if (companies.get(company).contains(id)) {
                input = scanner.nextLine();
                continue;
            }
            companies.get(company).add(id);

            input = scanner.nextLine();
        }

        companies
                .entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(c -> {
                            System.out.println(String.format("%s", c.getKey()));
                            c
                                    .getValue()
                                    .forEach(i -> System.out.println("-- " + i));
                        }
                );
    }
}