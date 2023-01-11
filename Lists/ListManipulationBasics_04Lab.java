package Lists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandList = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            if (commandList.contains("Add")) {
                int itemToAdd = Integer.parseInt(commandList.get(1));
                numbers.add(itemToAdd);
            } else if (commandList.contains("Remove")) {
                int itemToRemove = Integer.parseInt(commandList.get(1));
                numbers.remove(Integer.valueOf(itemToRemove));
            } else if (commandList.contains("RemoveAt")) {
                int indexToRemove = Integer.parseInt(commandList.get(1));
                numbers.remove(indexToRemove);
            } else if (commandList.contains("Insert")) {
                int itemToInsert = Integer.parseInt(commandList.get(1));
                int indexToInsert = Integer.parseInt(commandList.get(2));
                numbers.add(indexToInsert, itemToInsert);
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
