package Methods;

import java.util.Scanner;

public class PasswordValidator_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isValidContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isValidDigitsCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidDigitsCount(password) && isValidContent(password) && isValidLength(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength (String password) {
    if (password.length() >= 6 && password.length() <= 10) {
        return true;
    } else {
        return false;
    }
    }
    public static boolean isValidContent (String password) {
        for (char symbol:password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        } return true;
        }
    public static boolean isValidDigitsCount (String password) {
        int countDigits = 0;
        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
