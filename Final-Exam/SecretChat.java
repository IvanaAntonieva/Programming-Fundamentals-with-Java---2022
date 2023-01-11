import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder messageBuilder = new StringBuilder(scanner.nextLine());
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Reveal")) {
            String command = commandLine.split(":\\|:")[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandLine.split(":\\|:")[1]);
                    messageBuilder.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder substringBuilder = new StringBuilder(commandLine.split(":\\|:")[1]);
                    if (messageBuilder.toString().contains(substringBuilder)) {
                        int startIndex = messageBuilder.indexOf(String.valueOf(substringBuilder.charAt(0)));
                        int endIndex = startIndex + substringBuilder.length() - 1;
                        messageBuilder.delete(startIndex, endIndex + 1);
                        substringBuilder.reverse();
                        messageBuilder.append(substringBuilder);
                    } else {
                        System.out.println("error");
                        commandLine = scanner.nextLine();
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String occurrence = commandLine.split(":\\|:")[1];
                    String replacement = commandLine.split(":\\|:")[2];
                    String replacedString = messageBuilder.toString().replaceAll(occurrence, replacement);
                    messageBuilder.setLength(0);
                    messageBuilder.append(replacedString);
                    break;
            }
            System.out.println(messageBuilder.toString());
            commandLine = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + messageBuilder.toString());
    }
}
