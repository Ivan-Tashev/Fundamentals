package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypes_Exr_11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highestValue = -1.;
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow(snow * 1. / time, quality);
            if (value > highestValue) {
                highestSnow = snow;
                highestTime = time;
                highestQuality = quality;
                highestValue = value;
            }
        }
        System.out.println((String.format("%d : %d = %.0f (%d)", highestSnow, highestTime, highestValue, highestQuality)));
    }
}
