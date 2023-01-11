import java.util.Locale;
import java.util.Scanner;

public class decryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Finish")) {
            String[] commandData = commandInput.split("\\s+");
            String command = commandData[0];
            switch (command) {
                case "Replace":
                    String currentChar = commandData[1];
                    String newChar = commandData[2];
                    text = text.replace(currentChar, newChar);
                    textBuilder = new StringBuilder(text);
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    if (startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()) {
                        textBuilder.delete(startIndex, endIndex + 1);
                        text = textBuilder.toString();
                        System.out.println(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperOrLower = commandData[1];
                    if (upperOrLower.equals("Upper")) {
                        text = text.toUpperCase();
                        textBuilder = new StringBuilder(text);
                    } else if (upperOrLower.equals("Lower")) {
                        text = text.toLowerCase();
                        textBuilder = new StringBuilder(text);
                    }
                    System.out.println(text);
                    break;
                case "Check":
                    String string = commandData[1];
                    if (text.contains(string)) {
                        System.out.println("Message contains " + string);
                    } else {
                        System.out.println("Message doesn't contain " + string);
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt(commandData[1]);
                    int end = Integer.parseInt(commandData[2]);
                    if (start >= 0 && start < text.length() && end >= 0 && end < text.length()) {
                        String substring = text.substring(start, end + 1);
                        int sum = 0;
                        for (int i = 0; i < substring.length(); i++) {
                            char symbol = substring.charAt(i);
                            sum += symbol;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.println();
    }
}
