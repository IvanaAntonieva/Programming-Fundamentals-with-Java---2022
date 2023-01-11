package Lists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            if (commandLine.contains("Delete")) {
                int elementToDelete = Integer.parseInt(commandLine.get(1));
                numbers.removeAll(Arrays.asList(elementToDelete));
            } else if (commandLine.contains("Insert")) {
                int elementToInsert = Integer.parseInt(commandLine.get(1));
                int position = Integer.parseInt(commandLine.get(2));
                numbers.add(position, elementToInsert);
            }
            command = scanner.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
