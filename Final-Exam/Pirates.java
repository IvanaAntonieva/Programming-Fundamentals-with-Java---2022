import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String citiesInput = scanner.nextLine();
        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();

        while (!citiesInput.equals("Sail")) {
            String[] cityData = citiesInput.split("\\|\\|");
            String city = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);

            if (!citiesMap.containsKey(city)) {
                citiesMap.putIfAbsent(city, new ArrayList<>());
                citiesMap.get(city).add(0, population);
                citiesMap.get(city).add(1, gold);
            } else {
                int newPopulation = citiesMap.get(city).get(0) + population;
                citiesMap.get(city).set(0, newPopulation);
                int newGold = citiesMap.get(city).get(1) + gold;
                citiesMap.get(city).set(1, newGold);
            }
            citiesInput = scanner.nextLine();
        }
        String commandInput = scanner.nextLine();
        while (!commandInput.equals("End")) {
            String command = commandInput.split("=>")[0];
            String town = commandInput.split("=>")[1];
            if (command.equals("Plunder")) {
                int people = Integer.parseInt(commandInput.split("=>")[2]);
                int gold = Integer.parseInt(commandInput.split("=>")[3]);
                int currentPopulation = citiesMap.get(town).get(0) - people;
                int currentGold = citiesMap.get(town).get(1) - gold;

                citiesMap.get(town).set(0, currentPopulation);
                citiesMap.get(town).set(1, currentGold);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                if (currentPopulation <= 0 || currentGold <= 0) {
                    citiesMap.remove(town);
                    System.out.println(town + " has been wiped off the map!");
                }
            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(commandInput.split("=>")[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = citiesMap.get(town).get(1) + gold;
                    citiesMap.get(town).set(1, currentGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, currentGold);
                }
            }
            commandInput = scanner.nextLine();
        }
        if (citiesMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println("Ahoy, Captain! There are " + citiesMap.size() + " wealthy settlements to go to:");
            for (Map.Entry<String, List<Integer>> entry : citiesMap.entrySet()) {
                String city = entry.getKey();
                int population = entry.getValue().get(0);
                int gold = entry.getValue().get(1);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", city, population, gold);
            }
        }
    }
}
