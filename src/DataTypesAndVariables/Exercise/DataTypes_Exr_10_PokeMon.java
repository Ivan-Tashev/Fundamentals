package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaust = Integer.parseInt(scanner.nextLine());
        int curPower = startPower;
        int count = 0;

        while (curPower >= distance) {
            curPower -= distance;
            count++;
            if ((curPower == startPower / 2.) && (exhaust != 0)){
                curPower = curPower / exhaust;
            }
        }
        System.out.println(curPower);
        System.out.println(count);
    }
}