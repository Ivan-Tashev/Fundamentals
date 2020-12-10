package Lists.More;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_More_04_MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> one = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> two = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int biggerSize;
        int smallerSize;
        int index1;
        int index2;
        if (one.size() > two.size()) {
            biggerSize = one.size();
            smallerSize = two.size();
            index1 = one.get(one.size() - 1);
            index2 = one.get(one.size() - 2);
        }
        else if (one.size() < two.size()) {
            biggerSize = two.size();
            smallerSize = two.size();
            index1 = two.get(two.size() - 1);
            index2 = two.get(two.size() - 2);
        } else {
            return;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < smallerSize; i++) {
            result.add(one.get(i));
            result.add(two.get(two.size() - 1 - i));
        }
        // System.out.println(result.toString());

        int begIndex = Math.min(index1, index2);
        int endIndex = Math.max(index1, index2);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) > begIndex && result.get(i) < endIndex ){
                list.add(result.get(i));
            }
        }

        list.sort(null);

        for (int i = 0; i < list.size() - 1; i++) {
            int n = list.get(i);
            System.out.print(n + " ");
        }
        System.out.print(list.get(list.size() - 1));
    }
}
