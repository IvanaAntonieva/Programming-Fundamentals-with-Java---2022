import java.util.*;

public class ForceBook_09Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Lumpawaroo")) {

            if (command.contains("|")) {
                String[] commandData = command.split(" \\| ");
                String side = commandData[0];
                String user = commandData[1];
                if (!forceBook.containsKey(side)) {
                    forceBook.put(side, new ArrayList<>());
                }
                boolean isExistingUser = false;
                for (List<String> users : forceBook.values()) {
                    if (users.contains(user)) {
                        isExistingUser = true;
                    }
                }
                if (!isExistingUser) {
                    forceBook.get(side).add(user);
                }
            } else if (command.contains("->")) {
                String[] commandData = command.split(" -> ");
                String side = commandData[1];
                String user = commandData[0];
                forceBook.entrySet().forEach(entry -> entry.getValue().remove(user));
                if (forceBook.containsKey(side)) {
                    List<String> currentUsers = forceBook.get(side);
                    currentUsers.add(user);
                } else {
                    forceBook.put(side, new ArrayList<>());
                    forceBook.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            command = scanner.nextLine();
        }
        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
                });
    }
}
