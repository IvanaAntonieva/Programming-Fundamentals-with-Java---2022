package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftuniCoursePlanning_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] commandData = input.split(":");
            String command = commandData[0];
            switch (command) {
                case "Add":
                    String lessonToAdd = commandData[1];
                    if (!schedule.contains(lessonToAdd)) {
                        schedule.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = commandData[1];
                    int indexToInsert = Integer.parseInt(commandData[2]);
                    if (!schedule.contains(lessonToInsert)) {
                        schedule.add(indexToInsert, lessonToInsert);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = commandData[1];
                    if (schedule.contains(lessonToRemove)) {
                        schedule.remove(lessonToRemove);
                    }
                    int lessonToRemoveIndex = schedule.indexOf(lessonToRemove);
                    if (schedule.get(lessonToRemoveIndex + 1).equals(lessonToRemove + "-Exercise")) {
                        schedule.remove(lessonToRemoveIndex + 1);
                    }
                    break;
                case "Swap":
                    String firstLesson = commandData[1];
                    String secondLesson = commandData[2];

                    if (schedule.contains(firstLesson) && schedule.contains(secondLesson)) {
                        int firstLessonIndex = schedule.indexOf(firstLesson);
                        int secondLessonIndex = schedule.indexOf(secondLesson);
                        schedule.set(firstLessonIndex, secondLesson);
                        schedule.set(secondLessonIndex, firstLesson);

                        String firstExercise = firstLesson + "-Exercise";
                        String secondExercise = secondLesson + "-Exercise";
                        if (schedule.contains(firstExercise)) {
                            schedule.remove(schedule.indexOf(firstExercise));
                            schedule.add(schedule.indexOf(firstLesson) + 1, firstExercise);
                        }
                        if (schedule.contains(secondExercise)) {
                            schedule.remove(schedule.indexOf(secondExercise));
                            schedule.add(schedule.indexOf(secondLesson) + 1, secondExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String lessonTitle = commandData[1];
                    String exerciseTitle = lessonTitle + "-Exercise";
                    int lessonTitleIndex = schedule.indexOf(lessonTitle);
                    if (schedule.contains(lessonTitle)) {
                        if (lessonTitleIndex == schedule.size() - 1) {
                            schedule.add(lessonTitleIndex + 1, exerciseTitle);
                        } else if (!schedule.get(lessonTitleIndex + 1).equals(exerciseTitle)) {
                            schedule.add(lessonTitleIndex + 1, exerciseTitle);
                        }
                    } else {
                            schedule.add(lessonTitle);
                            schedule.add(exerciseTitle);
                    }
                    break;
            }
                    input = scanner.nextLine();
            }
            printList(schedule);
        }
        private static void printList(List<String> elements) {
            int count = 1;
            for (String element : elements) {
                System.out.println(count + "." + element);
                count++;
            }
        }
    }
