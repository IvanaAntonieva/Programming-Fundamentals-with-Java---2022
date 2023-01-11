import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<type>[AD])![^@!:>-]*->(?<soldiers>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackPlanets = new ArrayList<>();
        List<String> destructionPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String decryptedInput = getDecryptedInput(input);
            Matcher matcher = pattern.matcher(decryptedInput);
            if (matcher.find()) {
                String planet = matcher.group("planet");
                String type = matcher.group("type");
                if (type.equals("A")) {
                    attackPlanets.add(planet);
                } else if (type.equals("D")) {
                    destructionPlanets.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: " + attackPlanets.size());
        Collections.sort(attackPlanets);
        attackPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destructionPlanets.size());
        Collections.sort(destructionPlanets);
        destructionPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedInput(String input) {
        int countSpecialLetters = countSpecialLetters(input);
        StringBuilder decryptedInput = new StringBuilder();
        for (char symbol : input.toCharArray()) {
            char newSymbol = (char)(symbol-countSpecialLetters);
            decryptedInput.append(newSymbol);
        }
        return decryptedInput.toString();
    }

    private static int countSpecialLetters(String input) {
        int count = 0;
        for (char symbol:input.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
