import java.util.*;

public class WordSynonyms_02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

        if (!wordsMap.containsKey(word)) {
            wordsMap.put(word, new ArrayList<>());
            wordsMap.get(word).add(synonym);
        } else {
            wordsMap.get(word).add(synonym);
        }
        }
        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
