package RegEx.Exercise;

import java.util.Scanner;

public class RegEx_Exr_05_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //M3ph-0.5s-0.5t0.0**
        //M3ph1st0**, Azazel
        //Gos/ho

        String demon = scanner.nextLine();
        int health = 0;
        int damage = 0;
        for (int i = 0; i < demon.length(); i++) {
            if (!Character.isDigit(demon.charAt(i)) || demon.charAt(i) != '+'
                    || demon.charAt(i) != '-' || demon.charAt(i) != '*'
                    || demon.charAt(i) != '/' || demon.charAt(i) != '.') {

                health += demon.charAt(i);
            } else if (Character.isDigit(demon.charAt(i))) {
                damage += Integer.parseInt(String.valueOf(demon.charAt(i)));
            }
        }

    }
}
