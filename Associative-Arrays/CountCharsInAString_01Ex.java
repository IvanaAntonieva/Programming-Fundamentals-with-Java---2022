import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
           char currentChar = text.charAt(i);
           if (currentChar==' ') {
               continue;
           }
           if (!charMap.containsKey(currentChar)) {
               charMap.put(currentChar, 1);
           } else {
               charMap.put(currentChar, charMap.get(currentChar) + 1);
           }
        }
        charMap.entrySet().
                forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
