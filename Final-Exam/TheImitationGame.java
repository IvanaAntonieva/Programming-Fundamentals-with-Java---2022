import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            if (command.contains("Move")) {
              int n = Integer.parseInt(command.split("\\|")[1]);
                  String firstPart = message.substring(0, n);
                  String secondPart = message.substring(n);
                  message = secondPart + firstPart;

            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String textToInsert = command.split("\\|")[2];
                String firstPart = message.substring(0, index);
                String lastPart = message.substring(index);
                message = firstPart + textToInsert + lastPart;

            } else if (command.contains("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                    message = message.replace(substring, replacement);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
