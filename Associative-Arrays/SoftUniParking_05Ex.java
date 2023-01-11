import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registerMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            String command = inputData[0];
            String name = inputData[1];

            if (command.equals("register")) {
                String number = inputData[2];
                if (!registerMap.containsKey(name)) {
                    registerMap.put(name, number);
                    System.out.printf("%s registered %s successfully%n", name, number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", number);
                }
            } else if (command.equals("unregister")) {
                if (!registerMap.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    System.out.printf("%s unregistered successfully%n", name);
                    registerMap.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> entry : registerMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
