import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("\\!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            List<String> commandLine = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());
            switch (commandLine.get(0)) {
                case "Urgent":
                    String itemToAdd = commandLine.get(1);
                    if (!shoppingList.contains(itemToAdd)) {
                        shoppingList.add(0,itemToAdd);
                    }
                    break;
                case "Unnecessary":
                    String itemUnnecessary = commandLine.get(1);
                    if (shoppingList.contains(itemUnnecessary)) {
                        shoppingList.remove(itemUnnecessary);
                    }
                    break;
                case "Correct":
                    String oldItem = commandLine.get(1);
                    String newItem = commandLine.get(2);
                    if (shoppingList.contains(oldItem)) {
                        int indexOldItem = shoppingList.indexOf(oldItem);
                        shoppingList.set(indexOldItem, newItem);
                    }
                    break;
                case "Rearrange":
                    String itemToRearrange = commandLine.get(1);
                    if (shoppingList.contains(itemToRearrange)) {
                        shoppingList.remove(itemToRearrange);
                        shoppingList.add(itemToRearrange);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
