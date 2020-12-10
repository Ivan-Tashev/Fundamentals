package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lists_Exr_10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> course = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        boolean flag = true;
        while (flag) {
            List<String> token = Arrays.stream(scanner.nextLine().split(":"))
                    .collect(Collectors.toList());

            switch (token.get(0)) {
                case "Add":
                    String lesson = token.get(1);
                    if (!checkLesson(course, lesson)) {
                        course.add(lesson);
                    }
                    break;
                case "Insert":
                    lesson = token.get(1);
                    if (!checkLesson(course, lesson)) {
                        course.add(Integer.parseInt(token.get(2)), lesson);
                    }
                    break;
                case "Remove":
                    lesson = token.get(1);
                    if (checkLesson(course, lesson)) {
                        course.remove(lesson);
                    }
                    break;
                case "Swap":
                    lesson = token.get(1);
                    String lesson2 = token.get(2);
                    if (checkLesson(course, lesson) && checkLesson(course, lesson2)) {
                        for (int i = 0; i < course.size(); i++) {
                            if (course.get(i).equals(lesson)) {
                                course.set(i, lesson2);
                                continue;
                            }
                            if (course.get(i).equals(lesson2)) {
                                course.set(i, lesson);
                            }
                        }
                    }
                    break;
                case "Exercise":
                    lesson = token.get(1);
                    String exercise = token.get(1) + "-Exercise";
                    if (!course.contains(lesson)) {
                        course.add(lesson);
                        course.add(exercise);
                    } else if (course.contains(lesson) && !course.contains(exercise)) {
                        for (int i = 0; i < course.size(); i++) {
                            if (course.get(i).equals(lesson)){
                                course.add(i + 1,exercise);
                                break;
                            }
                        }
                    }
                    break;
                case "course start":
                    flag = false;
                    break;

            }
        }

        for (int i = 0; i < course.size(); i++) {
            String item = course.get(i);
            System.out.println(i + 1 + "." + item);

        }
    }

    public static boolean checkLesson(List<String> a, String b) {
        boolean flag = false;
        for (int i = 0; i < a.size(); i++) {
            if (b.equals(a.get(i))) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
