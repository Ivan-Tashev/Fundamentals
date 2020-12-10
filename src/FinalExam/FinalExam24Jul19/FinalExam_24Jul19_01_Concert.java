package FinalExam.FinalExam24Jul19;

import java.util.*;

public class FinalExam_24Jul19_01_Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Play; The Beatles; 2584
        //Add; The Beatles; John Lennon, Paul McCartney, George Harrison, Ringo Starr
        //Add; Eagles; Glenn Frey, Don Henley, Bernie Leadon, Randy Meisner
        //Play; Eagles; 1869
        //Add; The Rolling Stones; Brian Jones, Mick Jagger, Keith Richards
        //Add; The Rolling Stones; Brian Jones, Mick Jagger, Keith Richards, Bill Wyman, Charlie Watts, Ian Stewart
        //Play; The Rolling Stones; 4239
        //start of concert
        //The Rolling Stones

        Map<String, List<String>> bands = new LinkedHashMap<>();
        Map<String, Integer> times = new HashMap<>();
        String input = scanner.nextLine();
        int time = 0;
        while (!"start of concert".equals(input)) {
            String[] command = input.split("; ");
            String band = command[1];
            switch (command[0]) {
                case "Add":
                    String[] members = command[2].split(", ");
                    if (bands.containsKey(band)) {
                        for (int i = 0; i < members.length; i++) {
                            if (!bands.get(band).contains(members[i])) {
                                bands.get(band).add(members[i]);
                            }
                        }
                    } else {
                        bands.put(band, new ArrayList<>());
                        for (String member : members) {
                            if (!bands.get(band).contains(member)) {
                                bands.get(band).add(member);
                            }
                        }
                    }
                    break;
                case "Play":
                    time += Integer.parseInt(command[2]);
                    if (times.containsKey(band)) {
                        times.put(band, times.get(band) + Integer.parseInt(command[2]));
                    } else {
                        times.put(band, Integer.parseInt(command[2]));
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total time: %d%n", time);
        times
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(t -> System.out.printf("%s -> %d%n", t.getKey(), t.getValue()));
        String band = scanner.nextLine();
        System.out.println(band);
        bands.get(band).forEach(b -> System.out.printf("=> %s%n", b));
    }
}