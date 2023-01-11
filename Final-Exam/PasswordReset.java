import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();
        String commandLine = scanner.nextLine();
        String newText = "";
        while (!commandLine.equals("Done")) {
            String[] commandInfo = commandLine.split(" ");
            String command = commandInfo[0];
            switch (command) {
                case "TakeOdd":
                    for (int i = 1; i < password.length(); i = i + 2) {
                        char symbol = password.charAt(i);
                        passwordBuilder.append(symbol);
                    }
                    password = passwordBuilder.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandInfo[1]);
                    int length = Integer.parseInt(commandInfo[2]);
                    String stringToCut = password.substring(index, index + length);
                     password = password.replaceFirst(stringToCut, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandInfo[1];
                    String substitude = commandInfo[2];
                    if (password.contains(substring)) {
                         password = password.replace(substring, substitude);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }
}
