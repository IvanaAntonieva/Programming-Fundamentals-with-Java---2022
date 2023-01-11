import java.util.Scanner;

public class CaesarCipher_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            char newSymbol = (char) (symbol + 3);
            encryptedText.append(newSymbol);
        }
        System.out.println(encryptedText);
    }
}
