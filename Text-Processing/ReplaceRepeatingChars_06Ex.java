import java.util.Scanner;

public class ReplaceRepeatingChars_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "";

        char firstOcurr = input.charAt(0);
        result += firstOcurr;

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstOcurr) {
                result += currentSymbol;
                firstOcurr = currentSymbol;
            }
        }
        System.out.println(result);
    }
}
