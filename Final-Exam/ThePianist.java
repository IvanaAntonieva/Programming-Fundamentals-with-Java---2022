import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] piecesData = scanner.nextLine().split("\\|");
            String piece = piecesData[0];
            String composer = piecesData[1];
            String key = piecesData[2];
            List<String> piecesInfo = new ArrayList<>();
            piecesInfo.add(composer);
            piecesInfo.add(key);

            piecesMap.put(piece, piecesInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                String piece = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];
                List<String> addedPieceInfo = new ArrayList<>();
                addedPieceInfo.add(composer);
                addedPieceInfo.add(key);
                if (piecesMap.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    piecesMap.put(piece, addedPieceInfo);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.contains("Remove")) {
                String piece = command.split("\\|")[1];
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.contains("ChangeKey")) {
                String piece = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];
                if (!piecesMap.containsKey(piece)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                } else {
                    List<String> currentPieceInfo = piecesMap.get(piece);
                    currentPieceInfo.remove(1);
                    currentPieceInfo.add(newKey);
                    piecesMap.put(piece, currentPieceInfo);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                }
            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0),
                        entry.getValue().get(1)));
    }
}
