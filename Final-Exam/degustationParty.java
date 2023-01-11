import java.util.*;

public class degustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String commandInput = scanner.nextLine();
        int unlikedMealsCount = 0;

        while (!commandInput.equals("Stop")) {
            String[] commandData = commandInput.split("-");
            String command = commandData[0];
            String guest = commandData[1];
            String meal = commandData[2];
            switch (command) {
                case "Like":
                    if (!map.containsKey(guest)) {
                        map.putIfAbsent(guest, new ArrayList<>());
                    }
                    if (!map.get(guest).contains(meal)) {
                        map.get(guest).add(meal);
                    }
                    break;
                case "Dislike":
                    if (!map.containsKey(guest)) {
                        System.out.println(guest + " is not at the party.");
                    } else if (map.containsKey(guest)) {
                        if (!map.get(guest).contains(meal)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                        } else if (map.get(guest).contains(meal)) {
                            map.get(guest).remove(meal);
                            unlikedMealsCount++;
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);
                        }
                    }
                    break;
            }
         commandInput = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
        System.out.printf("Unliked meals: %d%n", unlikedMealsCount);
    }
}
