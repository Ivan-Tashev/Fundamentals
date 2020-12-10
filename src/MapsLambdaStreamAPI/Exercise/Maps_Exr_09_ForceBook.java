package MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class Maps_Exr_09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Light | Gosho
        //Dark | Pesho
        //Lumpawaroo

        String input = scanner.nextLine();
        Map<String, List<String>> forceBook = new TreeMap<>();

        while (!"Lumpawaroo".equals(input)) {
            String[] command = new String[2];
            String side = "";
            String user = "";

            if (input.contains(" | ")) {
                command = input.split("\\s+\\|\\s+");
                side = command[0];
                user = command[1];

                forceBook.putIfAbsent(side, new ArrayList<>());
                if (!forceBook.get(side).contains(user)) {
                    forceBook.get(side).add(user);
                }
            } else if (input.contains(" -> ")) {
                command = input.split("\\s+->\\s+");
                side = command[1];
                user = command[0];
                String otherSide = "";
                for (String s : forceBook.keySet()) { // finding otherSide
                    if (!s.equals(side)) {
                        otherSide = s;
                        break;
                    }
                }

                forceBook.putIfAbsent(side, new ArrayList<>());

                // change user side:  "DCay -> Lighter"
                if (forceBook.get(otherSide).contains(user)) {
                    if (!forceBook.get(side).contains(user)) {
                        forceBook.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                        forceBook.get(otherSide).remove(user);
                    }
                } else {
                    forceBook.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
            }
            input = scanner.nextLine();
        }

        forceBook
                .entrySet()
                .forEach(s -> {
                    if (s.getValue().size() > 0) {
                        System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());
                    }
                    s.getValue().stream()
                            .sorted()
                            .forEach(c -> System.out.printf("! %s%n", c));
                });
    }
}