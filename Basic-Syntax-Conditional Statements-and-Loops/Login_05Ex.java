import java.util.Scanner;

public class Login_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String passWord = "";

        for (int i = userName.length() - 1; i >= 0 ; i--) {
            char currentSymbol = userName.charAt(i);
            passWord += currentSymbol;
        }

        int countFailed = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(passWord)) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(passWord)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
