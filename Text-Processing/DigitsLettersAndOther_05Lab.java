import java.util.Scanner;

public class DigitsLettersAndOther_05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digitStr = new StringBuilder();
        StringBuilder letterStr = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitStr = digitStr.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letterStr = letterStr.append(currentChar);
            } else {
                otherStr = otherStr.append(currentChar);
            }
        }
        System.out.println(digitStr);
        System.out.println(letterStr);
        System.out.println(otherStr);
    }
}
