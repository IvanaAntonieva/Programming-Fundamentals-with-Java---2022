import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class easterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "[@#]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*[\\/]+(?<amount>[0-9]+)[\\/]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String color = matcher.group("color");
            String amount = matcher.group("amount");
            System.out.printf("You found %s %s eggs!%n", amount, color);
        }
    }
}
