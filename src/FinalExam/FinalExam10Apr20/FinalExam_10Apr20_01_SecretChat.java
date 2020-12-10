package FinalExam.FinalExam10Apr20;

import java.util.Scanner;

public class FinalExam_10Apr20_01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //heVVodar!gniV
        //ChangeAll:|:V:|:l
        //Reverse:|:!gnil
        //InsertSpace:|:5
        //Reveal

        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!"Reveal".equals(input)) {
            String[] command = input.split(":\\|:");

            switch (command[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    message = message.substring(0, index) + " " + message.substring(index);
                    System.out.println(message);
                    break;
                case "Reverse":
                    String sub = command[1];
                    if (message.contains(sub)){
                        message = message.replace(sub,"");
                        StringBuilder sb = new StringBuilder(sub);
                        sb.reverse();
                        message = message.concat(String.valueOf(sb));
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    sub = command[1];
                    String replacement = command[2];
                    message = message.replaceAll(sub, replacement);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}