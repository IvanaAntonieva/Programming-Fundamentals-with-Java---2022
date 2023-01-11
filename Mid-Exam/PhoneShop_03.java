import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfPhones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            List<String> commandList = Arrays.stream(command.split(" - ")).collect(Collectors.toList());
            if (command.contains("Add")) {
                String phoneToAdd = commandList.get(1);
                if (!listOfPhones.contains(phoneToAdd)) {
                    listOfPhones.add(phoneToAdd);
                }
            } else if (command.contains("Remove")) {
                String phoneToRemove = commandList.get(1);
                if (listOfPhones.contains(phoneToRemove)) {
                    listOfPhones.remove(phoneToRemove);
                }
            } else if (command.contains("Bonus")) {
                List<String> phoneBonus = Arrays.stream(commandList.get(1).split("\\:")).collect(Collectors.toList());
                String oldPhone = phoneBonus.get(0);
                String newPhone = phoneBonus.get(1);
                if (listOfPhones.contains(oldPhone)) {
                    int indexOldPhone = listOfPhones.indexOf(oldPhone);
                    int indexNewPhone = indexOldPhone + 1;
                    listOfPhones.add(indexNewPhone, newPhone);
                }
            } else if (command.contains("Last")) {
                String phoneLast = commandList.get(1);
                if (listOfPhones.contains(phoneLast)) {
                    int index = listOfPhones.indexOf(phoneLast);
                    listOfPhones.add(phoneLast);
                    listOfPhones.remove(index);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", listOfPhones));
    }
}
