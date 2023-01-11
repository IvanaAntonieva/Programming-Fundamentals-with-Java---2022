package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
public class ListManipulationAdvanced_05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            if (commandList.contains("Contains")) {
                int numberToContains = Integer.parseInt(commandList.get(1));
                if (numbers.contains(numberToContains)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (commandList.contains("even")) {
                String output = "";
                for (int num : numbers) {
                    if (num % 2 == 0) {
                        output += num + " ";
                    }
                }
                System.out.println(output);
            } else if (commandList.contains("odd")) {
                String output = "";
                for (int num : numbers) {
                    if (num % 2 == 1) {
                        output += num + " ";
                    }
                }
                System.out.println(output);
            } else if (commandList.contains("sum")) {
                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum += numbers.get(i);
                }
                System.out.println(sum);

            } else if (commandList.contains("Filter")) {
                String condition = commandList.get(1);
                int number = Integer.parseInt(commandList.get(2));
                List<Integer> conditionalNumList = getConditionsNumbers(numbers, condition, number);
                System.out.println(conditionalNumList.toString().replaceAll("[\\[\\],]", ""));
            }
            command = scanner.nextLine();
        }
    }

    public static List<Integer> getConditionsNumbers(List<Integer> numbers, String condition, int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if (condition.equals("<")) {
                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals("<=")) {
                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            }
        }
        return resultList;
    }
}