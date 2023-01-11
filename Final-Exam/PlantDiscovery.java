import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        Map<String, Double> rateMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputData = input.split("<->");
            String plant = inputData[0];
            int rarity = Integer.parseInt(inputData[1]);

            plantsRarityMap.put(plant, rarity);
            rateMap.putIfAbsent(plant, 0.00);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Exhibition")) {
            String command = commandLine.split("[: -]+")[0];
            String plant = commandLine.split("[: -]+")[1];

            if (!rateMap.containsKey(plant)) {
                System.out.println("error");
            } else {

                switch (command) {
                    case "Rate":
                        double currentRate = Double.parseDouble(commandLine.split("[: -]+")[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, currentRate);
                        } else {
                            double newRate = (rateMap.get(plant) + currentRate) / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(commandLine.split("[: -]+")[2]);
                        plantsRarityMap.put(plant, newRarity);
                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                    default:
                        System.out.println("error");
                }
            }
                commandLine = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarityMap.entrySet()
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
        });
    }
}
