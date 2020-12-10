package FinalExam.FinalExam9Aug19;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FinalExam_9Aug19_03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //New follower: gosho
        //Like: gosho: 5
        //Comment: gosho
        //New follower: gosho
        //New follower: tosho
        //Comment: gosho
        //Comment: tosho
        //Comment: pesho
        //Log out

        Map<String, int[]> followers = new TreeMap<>();
        //  int[0] likes, int[1] comments
        String input = scanner.nextLine();
        while (!"Log out".equals(input)) {
            String[] command = input.split(": ");
            String username = command[1];
            switch (command[0]) {
                case "New follower":
                    followers.putIfAbsent(username, new int[]{0, 0});
                    break;
                case "Like":
                    int count = Integer.parseInt(command[2]);
                    if (followers.containsKey(username)) {
                        followers.get(username)[0] += count;
                    } else { // username not exist
                        followers.put(username, new int[]{count, 0});
                    }
                    break;
                case "Comment":
                    if (followers.containsKey(username)) {
                        followers.get(username)[1] += 1;
                    } else {
                        followers.put(username, new int[]{0, 1});
                    }
                    break;
                case "Blocked":
                    if (followers.containsKey(username)) {
                        followers.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followers.size());
        followers
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    return b.getValue()[0] - a.getValue()[0];
                })
                .forEach(f -> System.out.printf("%s: %d%n",
                        f.getKey(), (f.getValue()[0] + f.getValue()[1])));
    }
}