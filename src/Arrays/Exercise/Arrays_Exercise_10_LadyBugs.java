package Arrays.Exercise;

import java.util.Scanner;

public class Arrays_Exercise_10_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] initialIndexes = scanner.nextLine().split(" "); // 0 1
        int[] index = new int[initialIndexes.length];
        for (int i = 0; i < index.length; i++) {  // convert to int[] index
            index[i] = Integer.parseInt(initialIndexes[i]);
        }

        int[] positions = new int[length]; // fill positions with 1 in int[] positions
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if (index[j] <= positions.length - 1) {
                    positions[index[j]] = 1;
                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] move = command.split(" ");
            int pos = Integer.parseInt(move[0]);
            int fly = Integer.parseInt(move[2]);

            if (positions[pos] == 1 && move[1].equals("right")) {
                for (int i = pos; i < positions.length; i++) {
                    positions[pos] = 0;
                    if (pos == positions.length - 1) {
                        if (positions[pos] == 1) {
                            positions[pos] = 0;
                            break;
                        } else {
                            positions[pos] = 1;
                            break;
                        }
                    }
                    if (positions[i + 1] == 1) {
                        continue;
                    } else {
                        positions[i + 1] = 1;
                        break;
                    }
                }
            } else if (positions[pos] == 1 && move[1].equals("left")) {

            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }

    }
}
