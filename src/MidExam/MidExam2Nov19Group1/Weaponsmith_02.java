package MidExam.MidExam2Nov19Group1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weaponsmith_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] particles = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        while (!"Done".equals(command)) {
            String[] tocken = command.split("\\s+");

            switch (tocken[1]) {
                case "Left":
                    int index = Integer.parseInt(tocken[2]);
                    if (0 < index && index < particles.length){
                        String temp = particles[index - 1];
                        particles[index - 1] = particles[index];
                        particles[index] = temp;
                    }
                    break;
                case "Right":
                    index = Integer.parseInt(tocken[2]);
                    if (0 <= index && index < particles.length - 1){
                        String temp = particles[index + 1];
                        particles[index + 1] = particles[index];
                        particles[index] = temp;
                    }
                    break;
                case "Even":
                    List<String> words = new ArrayList<>();
                    for (int i = 0; i < particles.length; i++) {
                        if (i % 2 == 0) {
                            words.add(particles[i]);
                        }
                    }
                    System.out.println(String.join(" ", words));
                    break;
                case "Odd":
                    words = new ArrayList<>();
                    for (int i = 0; i < particles.length; i++) {
                        if (i % 2 == 1) {
                            words.add(particles[i]);
                        }
                    }
                    System.out.println(String.join(" ", words));
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You crafted %s!", String.join("", particles));
    }
}