package FinalExam.FinalExam9Aug20;

import java.util.Scanner;

public class FinalExam_9Aug20_01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hawai::Cyprys-Greece
        //Add Stop:7:Rome
        //Remove Stop:11:16
        //Switch:Hawai:Bulgaria
        //Travel

        String stops = scanner.nextLine();
        String initial = stops;
        String input;
        while (!"Travel".equals(input = scanner.nextLine())) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String toInsert = command[2];
                    if (index >= 0 && index < stops.length()){
                        stops = stops.substring(0,index) + toInsert + stops.substring(index);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int beg = Integer.parseInt(command[1]);
                    int end = Integer.parseInt(command[2]);
                    if ((beg >= 0 && beg < stops.length()) && (end >= 0 && end < stops.length()) && end >= beg){
                        stops = stops.replace(stops.substring(beg, end + 1), "");
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = command[1];
                    String newString = command[2];
                    if (initial.contains(oldString)){
                        stops = stops.replaceAll(oldString, newString);
                    }
                    System.out.println(stops);
                    break;
            }
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}