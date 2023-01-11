import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        List<String> playersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        Map<String, Integer> playersDistances = new LinkedHashMap<>();
        playersNames.forEach(player -> playersDistances.put(player, 0));

        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
        StringBuilder name = new StringBuilder();
        Matcher matcherName = patternName.matcher(input);
        while (matcherName.find()) {
            name.append(matcherName.group());
        }
        int distance = 0;
        Matcher matcherDistance = patternDistance.matcher(input);
        while (matcherDistance.find()) {
            distance += Integer.parseInt(matcherDistance.group());
        }
        String player = name.toString();
        if (playersDistances.containsKey(player)) {
            int currentDistance = playersDistances.get(player);
            playersDistances.put(player, currentDistance + distance);
        }
        input = scanner.nextLine();
        }
        List<String> firstThree = playersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}
