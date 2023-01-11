package Methods;

import java.util.Scanner;

public class CharactersinRange_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        charsInRange(firstChar, secondChar);
    }

    public static void charsInRange(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (char symbol = (char)(ch1 + 1); symbol < ch2 ; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (ch2 + 1); symbol < ch1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
