package MapsLambdaStreamAPI.Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Maps_Exr_05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //register John CS1234JS
        //register George JAVA123S
        //register Andy AB4142CD
        //register Jesica VR1223EE
        //unregister Andy

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String user = command[1];

            switch (command[0]) {
                case "register":
                    String plate = command[2];
                    if (parking.containsKey(user)) {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                parking.get(user));
                        continue;
                    }
                    parking.putIfAbsent(user, plate);
                    System.out.printf("%s registered %s successfully%n", user, plate);
                    break;
                case "unregister":
                    if (!parking.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found%n", user);
                        continue;
                    }
                    parking.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                    break;
            }
        }
        parking.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
