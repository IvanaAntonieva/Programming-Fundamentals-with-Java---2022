import java.util.*;

public class OddOccurrences_03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> wordsCountMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();

            Integer count = wordsCountMap.get(word);
            if (wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, count + 1);
            } else {
                wordsCountMap.put(word, 1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddWords));
    }
}
