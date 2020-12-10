package ObjectsAndClasses.Lab.Songs_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");

            Song currentSong = new Song(input[0], input[1], input[2]);
            songs.add(currentSong);
        }

        String print = scanner.nextLine();

        if (print.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(print)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
