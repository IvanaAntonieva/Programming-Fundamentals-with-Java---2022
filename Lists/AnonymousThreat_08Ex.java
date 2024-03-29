package Lists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
        List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
        if (commandList.contains("merge")) {
            int startIndex = Integer.parseInt(commandList.get(1));
            int endIndex = Integer.parseInt(commandList.get(2));
            if (startIndex < 0) {
                startIndex = 0;
            }
            if (endIndex > inputList.size() - 1) {
                endIndex = inputList.size() - 1;
            }
            boolean validIndexes = startIndex <= inputList.size() - 1 &&
                    endIndex >= 0 && startIndex < endIndex;

            if (validIndexes) {
                String mergedText = "";
                for (int i = startIndex; i <= endIndex ; i++) {
                    String currentText = inputList.get(i);
                    mergedText += currentText;
                }
                for (int i = startIndex; i <= endIndex ; i++) {
                    inputList.remove(startIndex);
                }
                inputList.add(startIndex, mergedText);
            }
        } else if (commandList.contains("divide")) {
            int index = Integer.parseInt(commandList.get(1));
            int parts = Integer.parseInt(commandList.get(2));
            String elementToDivide = inputList.get(index);
            inputList.remove(index);
            int partSize = elementToDivide.length() / parts;
            int begin = 0;

            for (int i = 1; i < parts ; i++) {
                inputList.add(index, elementToDivide.substring(begin, begin + partSize));
                index++;
                begin += partSize;
            }
            inputList.add(index, elementToDivide.substring(begin));
            }
        command = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputList));
    }
}
