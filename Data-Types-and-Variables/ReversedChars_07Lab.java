import java.util.Scanner;

public class ReversedChars_07Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        String result = String.format("%c %c %c", thirdChar, secondChar, firstChar);
        System.out.println(result);
    }
}
