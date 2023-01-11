package Lists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxSize = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            if (commandLine.get(0).equals("Add")) {
                int passangers = Integer.parseInt(commandLine.get(1));
                numbers.add(passangers);
            } else {
                int passangersToFit = Integer.parseInt(commandLine.get(0));
                for (int i = 0; i < numbers.size(); i++) {
                    int wagon = numbers.get(i);
                    if ((passangersToFit + wagon) <= maxSize) {
                        wagon += passangersToFit;
                        numbers.set(i, wagon);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
            for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
