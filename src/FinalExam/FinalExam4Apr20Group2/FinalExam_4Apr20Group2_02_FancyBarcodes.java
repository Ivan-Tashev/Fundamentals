package FinalExam.FinalExam4Apr20Group2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_4Apr20Group2_02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //@#FreshFisH@#
        //@###Brea0D@###
        //@##Che4s6E@##

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+");

        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find()){
                StringBuilder productGroup = new StringBuilder();
                for (int j = 0; j < matcher.group().length(); j++) {
                    if (Character.isDigit(matcher.group().charAt(j))){
                        productGroup.append(matcher.group().charAt(j));
                    }
                }
                if (productGroup.length() == 0) System.out.println("Product group: 00");
                else System.out.println(String.format("Product group: %s", productGroup.toString()));

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}