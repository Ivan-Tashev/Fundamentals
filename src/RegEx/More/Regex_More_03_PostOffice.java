package RegEx.More;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_More_03_PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sdsGGasAOTPWEEEdas$AOTP$|a65:1.2s65:03d79:01ds84:02! -80:07++ABs90:1.1|adsaArmyd Gara
        // So La Arm Armyw21 Argo O daOfa Or Ti Sar saTheww The Parahaos

        String[] parts = scanner.nextLine().split("\\|");

        Pattern pattern = Pattern.compile("([\\#\\$\\%\\&\\*]+)(?<upper>[A-Z]+)\\1+");
        Matcher matcher  = pattern.matcher(parts[0]);

        System.out.println(matcher.group());

    }
}
