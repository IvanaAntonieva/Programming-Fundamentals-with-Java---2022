package Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            List<String> commandLine = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
            int index = Integer.parseInt(commandLine.get(1));
            int powerValueRadius = Integer.parseInt(commandLine.get(2));

            if (commandLine.contains("Shoot")) {
                if (index >= 0 && index < numbers.size()) {
                    int shotTarget = numbers.get(index) - powerValueRadius;
                    if (shotTarget <= 0) {
                        numbers.remove(index);
                    } else {
                        numbers.set(index, shotTarget);
                    }
                }
                } else if (commandLine.contains("Add")) {
                if (index >= 0 && index < numbers.size()) {
                numbers.add(index, powerValueRadius);
                } else {
                    System.out.println("Invalid placement!");
                    }
                } else if (commandLine.contains("Strike")) {
                if (index - powerValueRadius >= 0 && index + powerValueRadius < numbers.size()) {
                    int area = 2 * powerValueRadius + 1;
                    for (int i = 0; i < area; i++) {
                        numbers.remove(index - powerValueRadius);
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }
        List<String> resultList = new ArrayList<>();
        for (int num:numbers) {
            resultList.add(String.valueOf(num));
        }
        System.out.println(String.join("|", resultList));
    }
}

