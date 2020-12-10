package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_09_PockemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 4 5 3
        List<Integer> pockemons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (pockemons.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                sum += pockemons.get(0);
                int removedValue = pockemons.get(0);
                pockemons.set(0,pockemons.get(pockemons.size() - 1));
                for (int i = 0; i < pockemons.size(); i++) {
                    if (pockemons.get(i) <= removedValue) {
                        pockemons.set(i,pockemons.get(i) + removedValue);
                    } else {
                        pockemons.set(i,pockemons.get(i) - removedValue);
                    }
                }
                continue;
            } else if (index > pockemons.size() - 1) {
                sum += pockemons.get(pockemons.size() - 1);
                int removedValue = pockemons.get(pockemons.size() - 1);
                pockemons.set(pockemons.size() - 1, pockemons.get(0));
                for (int i = 0; i < pockemons.size(); i++) {
                    if (pockemons.get(i) <= removedValue) {
                        pockemons.set(i,pockemons.get(i) + removedValue);
                    } else {
                        pockemons.set(i,pockemons.get(i) - removedValue);
                    }
                }
                continue;
            }

            sum += pockemons.get(index);
            int removedValue = pockemons.get(index);
            pockemons.remove(index);
            for (int i = 0; i < pockemons.size(); i++) {
                if (pockemons.get(i) <= removedValue) {
                    pockemons.set(i,pockemons.get(i) + removedValue);
                } else {
                    pockemons.set(i,pockemons.get(i) - removedValue);
                }
            }
        }
        System.out.println(sum);
    }
}
