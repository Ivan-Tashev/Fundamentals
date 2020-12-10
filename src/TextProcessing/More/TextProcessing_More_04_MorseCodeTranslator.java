package TextProcessing.More;

import java.util.Scanner;

public class TextProcessing_More_04_MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // .. | -- .- -.. . | -.-- --- ..- | .-- .-. .. - . | .- | .-.. --- -. --. | -.-. --- -.. .

        String[] text = scanner.nextLine().split("\\|");
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            String[] word = text[i].split(" ");

            for (int j = 0; j < word.length; j++) {

                switch (word[j]) {
                    case ".-": message.append("A"); break;
                    case "-...": message.append("B"); break;
                    case "-.-.": message.append("C"); break;
                    case "-..": message.append("D"); break;
                    case ".": message.append("E"); break;
                    case "..-.": message.append("F"); break;
                    case "--.": message.append("G"); break;
                    case "....": message.append("H"); break;
                    case "..": message.append("I"); break;
                    case ".---": message.append("J"); break;
                    case "-.-": message.append("K"); break;
                    case ".-..": message.append("L"); break;
                    case "--": message.append("M"); break;
                    case "-.": message.append("N"); break;
                    case "---": message.append("O"); break;
                    case ".--.": message.append("P"); break;
                    case "--.-": message.append("Q"); break;
                    case ".-.": message.append("R"); break;
                    case "...": message.append("S"); break;
                    case "-": message.append("T"); break;
                    case "..-": message.append("U"); break;
                    case "...-": message.append("V"); break;
                    case ".--": message.append("W"); break;
                    case "-..-": message.append("X"); break;
                    case "-.--": message.append("Y"); break;
                    case "--..": message.append("Z"); break;
                }
            }
            message.append(" ");
        }
        message.deleteCharAt(message.length() -1);
        System.out.println(message);
    }
}