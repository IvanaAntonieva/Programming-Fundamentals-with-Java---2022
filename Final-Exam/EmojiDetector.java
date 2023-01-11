import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        BigInteger coolThreshold = new BigInteger("1");
        for (int i = 0; i < text.length(); i++) {
            char digit = text.charAt(i);
            if (Character.isDigit(digit)) {
                int number = Integer.parseInt(String.valueOf(digit));
                coolThreshold = coolThreshold.multiply(BigInteger.valueOf(number));
            }
        }
        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int emojisCount = 0;
        List<String> coolEmojis = new ArrayList<>();

        while (matcher.find()) {
            emojisCount++;
            int coolness = 0;
            String emoji = matcher.group("emoji");
            for (int i = 0; i < emoji.length(); i++) {
                char symbol = emoji.charAt(i);
                coolness += symbol;
            }
                if (BigInteger.valueOf(coolness).compareTo(coolThreshold) >= 0) {
                    coolEmojis.add(matcher.group());
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojisCount + " emojis found in the text. The cool ones are:");
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}
