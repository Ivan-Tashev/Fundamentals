package FinalExam.FinalExam4Apr20Group2;

import java.util.Scanner;

public class FinalExam_4Apr20Group2_01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr
        //TakeOdd
        //Cut 15 3
        //Substitute :: -
        //Substitute | ^
        //Done

        String pass = scanner.nextLine();
        String line = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        while (!"Done".equals(line)) {
            String[] input = line.split("\\s+");

            switch (input[0]) {
                case "TakeOdd":
                    if (pass.length() == 1){
                        result = new StringBuilder(pass);
                        break;
                    }
                    for (int i = 1; i < pass.length(); i += 2) {
                        result.append(pass.charAt(i));
                    }
                    System.out.println(result);
                    break;
                case "Cut":
                    if (result.length() == 0) result = new StringBuilder(pass);
                    int index = Integer.parseInt(input[1]);
                    int length = Integer.parseInt(input[2]);
                    result.replace(index, index + length, "");
                    System.out.println(result);
                    break;
                case "Substitute":
                    if (result.length() == 0) result = new StringBuilder(pass);
                    if (result.toString().contains(input[1])){
                        String res = result.toString().replaceAll(input[1], input[2]);
                        System.out.println(res);
                        result = new StringBuilder(res);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", result);
    }
}