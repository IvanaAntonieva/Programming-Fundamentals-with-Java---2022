import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> usernamePoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] inputData = input.split("-");
            String username = inputData[0];
            if (inputData.length == 3) {
                String language = inputData[1];
                int points = Integer.parseInt(inputData[2]);
                if (!usernamePoints.containsKey(username)) {
                    usernamePoints.put(username, points);
                } else {
                    int currentPoints = usernamePoints.get(username);
                    if (points > currentPoints) {
                        usernamePoints.put(username, points);
                    }
                }
                    if (!languageCount.containsKey(language)) {
                        languageCount.put(language, 1);
                    } else {
                        languageCount.put(language, languageCount.get(language) + 1);
                    }
                } else {
                    usernamePoints.remove(username);
                }
                input = scanner.nextLine();
            }
            System.out.println("Results:");
            usernamePoints.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
            System.out.println("Submissions:");
            languageCount.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
