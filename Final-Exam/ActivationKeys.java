import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] commandLine = command.split(">>>");
            String firstCommand = commandLine[0];
            switch (firstCommand) {
                case "Contains":
                    String substring = commandLine[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = commandLine[1];
                    int startIndex = Integer.parseInt(commandLine[2]);
                    int endIndex = Integer.parseInt(commandLine[3]);
                    String substringToFlip = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
                        activationKey = activationKey.replace(substringToFlip, substringToFlip.toUpperCase());
                    } else if (upperOrLower.equals("Lower")) {
                        activationKey = activationKey.replace(substringToFlip, substringToFlip.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startInd = Integer.parseInt(commandLine[1]);
                    int endInd = Integer.parseInt(commandLine[2]);
                    String stringToSlice = activationKey.substring(startInd, endInd);
                    activationKey = activationKey.replace(stringToSlice, "");
                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
