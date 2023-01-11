package Methods;

import java.util.Scanner;

public class MiddleCharacters_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        middleChars(input);
    }
    public static void middleChars (String input) {
        if (input.length() % 2 == 1) {
            System.out.println(input.charAt(input.length() / 2));
        } else {
            int indexFistMidChar = input.length() / 2 - 1;
            int indexSecondMidChar = input.length() / 2;
            System.out.println("" + input.charAt(indexFistMidChar) + input.charAt(indexSecondMidChar));
        }
    }
}
