import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int pairs = 0;
        List<String> mirrorWords = new ArrayList<>();

            while (matcher.find()) {
                String firstWord = matcher.group("first");
                String secondWord = matcher.group("second");
                pairs++;
                StringBuilder secondWordBuilder = new StringBuilder(secondWord);
                String reversedSecondWord = secondWordBuilder.reverse().toString();
                if (reversedSecondWord.equals(firstWord)) {
                    mirrorWords.add(firstWord + " <=> " + secondWord);
                }
            }
            if (pairs == 0) {
                System.out.println("No word pairs found!");
            } else {
                System.out.printf("%d word pairs found!%n", pairs);
            }

            if (mirrorWords.isEmpty()) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", mirrorWords));
        }
    }
}
