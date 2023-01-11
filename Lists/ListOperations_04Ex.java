package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOperations_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            if (commandLine.contains("Add")) {
                int numberToAdd = Integer.parseInt(commandLine.get(1));
                numbers.add(numberToAdd);
            } else if (commandLine.contains("Insert")) {
                int numberToInsert = Integer.parseInt(commandLine.get(1));
                int indexToInsert = Integer.parseInt(commandLine.get(2));
                if (indexToInsert >=0 && indexToInsert < numbers.size()) {
                    numbers.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine.contains("Remove")) {
                int indexToRemove = Integer.parseInt(commandLine.get(1));
                if (indexToRemove >=0 && indexToRemove < numbers.size()) {
                    numbers.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine.contains("left")) {
                int count = Integer.parseInt(commandLine.get(2));
                for (int i = 1; i <= count; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber);
                    numbers.remove(0);
                }
            } else if (commandLine.contains("right")) {
                int count = Integer.parseInt(commandLine.get(2));
                for (int i = 1; i <= count; i++) {
                    int lastNumber = numbers.get(numbers.size()-1);
                    numbers.add(0, lastNumber);
                    numbers.remove(numbers.size()-1);
                }
            }
            command = scanner.nextLine();
        }
        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}
