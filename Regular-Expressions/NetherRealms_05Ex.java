import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> demons = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .collect(Collectors.toList());

        String healthRegex = "[^\\d+\\-*\\/.]";
        Pattern healthPattern = Pattern.compile(healthRegex);

        String damageRegex = "-?\\d+\\.?\\d*";
        Pattern damagePattern = Pattern.compile(damageRegex);

        String operationRegex = "[*\\/]";
        Pattern operationPattern = Pattern.compile(operationRegex);

        for (String demon : demons) {
            Matcher matcher = healthPattern.matcher(demon);
            int health = 0;
            while (matcher.find()) {
                health += matcher.group().charAt(0);
            }
            matcher = damagePattern.matcher(demon);
            double damage = 0;
            while (matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }
            matcher = operationPattern.matcher(demon);
            while (matcher.find()) {
                if (matcher.group().equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);
        }
    }
}
