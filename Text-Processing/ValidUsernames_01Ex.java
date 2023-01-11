import java.util.Scanner;

public class ValidUsernames_01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputData = input.split(", ");
        for (String username : inputData) {
            if (validUsername(username)) {
                System.out.println(username);
            }
        }
    }
    public static boolean validUsername (String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
