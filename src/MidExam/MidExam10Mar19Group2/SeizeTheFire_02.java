package MidExam.MidExam10Mar19Group2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //High = 89#Low = 28#Medium = 77#Low = 23
        //1250
        String[] fireCells = (scanner.nextLine().split("#"));
        int water = Integer.parseInt(scanner.nextLine());
        double effort = 0;
        List<String> putOutFire = new ArrayList<>();
        int sumFire = 0;

        for (int i = 0; i < fireCells.length; i++) {
            String[] cell = fireCells[i].split(" = ");
            int fire = Integer.parseInt(cell[1]);

            switch (cell[0]) {
                case "High":
                    if (water < fire) continue;
                    if (fire > 80 && fire <= 125){
                        water -= fire;
                        effort += (fire * 0.25);
                        putOutFire.add(" - " + cell[1]);
                        sumFire += fire;
                    }
                    break;
                case "Medium":
                    if (water < fire) continue;
                    if (fire > 50 && fire <= 80){
                        water -= fire;
                        effort += (fire * 0.25);
                        putOutFire.add(" - " + cell[1]);
                        sumFire += fire;
                    }
                    break;
                case "Low":
                    if (water < fire) continue;
                    if (fire > 0 && fire <=50){
                        water -= fire;
                        effort += (fire * 0.25);
                        putOutFire.add(" - " + cell[1]);
                        sumFire += fire;
                    }
                    break;
            }
        }
        System.out.println("Cells:");
        for (String s : putOutFire) {
            System.out.println(s);
        }
        System.out.printf("Effort: %.2f%n", effort);
        System.out.printf("Total Fire: %d", sumFire);
    }
}