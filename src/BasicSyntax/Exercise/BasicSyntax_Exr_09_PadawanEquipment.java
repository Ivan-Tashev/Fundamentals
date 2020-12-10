package BasicSyntax.Exercise;

import java.util.Scanner;

public class BasicSyntax_Exr_09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());

        int freeBelt = students / 6;
        double beltCost = (students - freeBelt) * belt;

        double equipmnetCost = (lightsaber * Math.ceil(students * 1.1)) + (robe * students) + beltCost;

        if (equipmnetCost <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", equipmnetCost);
        } else {
            double diff = equipmnetCost - money;
            System.out.printf("Ivan Cho will need %.2flv more.",diff);
        }
    }
}
