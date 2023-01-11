import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] carInfo = input.split("\\|");
            String car = carInfo[0];
            int mileage = Integer.parseInt(carInfo[1]);
            int fuel = Integer.parseInt(carInfo[2]);

            carsMap.putIfAbsent(car, new ArrayList<>());
            carsMap.get(car).add(0, mileage);
            carsMap.get(car).add(1, fuel);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandLine = command.split(" : ");
            String currentCommand = commandLine[0];
            String currentCar = commandLine[1];
            int currentFuel = 0;

            switch (currentCommand) {
                case "Drive":
                    int currentDistance = Integer.parseInt(commandLine[2]);
                    currentFuel = Integer.parseInt(commandLine[3]);
                    if (currentFuel > carsMap.get(currentCar).get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int newMileage = carsMap.get(currentCar).get(0) + currentDistance;
                        carsMap.get(currentCar).set(0, newMileage);
                        int newFuel = carsMap.get(currentCar).get(1) - currentFuel;
                        carsMap.get(currentCar).set(1, newFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", currentCar, currentDistance, currentFuel);
                    }
                    break;
                case "Refuel":
                    int diff = 0;
                    currentFuel = Integer.parseInt(commandLine[2]);
                    int newFuel = currentFuel + carsMap.get(currentCar).get(1);
                    if (newFuel >= 75) {
                        newFuel = 75;
                        diff = 75 - carsMap.get(currentCar).get(1);
                    } else {
                        diff = currentFuel;
                    }
                    carsMap.get(currentCar).set(1, newFuel);
                    System.out.printf("%s refueled with %d liters%n", currentCar, diff);
                    break;
                case "Revert":
                    int currentKilometers = Integer.parseInt(commandLine[2]);
                    int newMileage = carsMap.get(currentCar).get(0) - currentKilometers;
                    if (newMileage < 10000) {
                        newMileage = 10000;
                        carsMap.get(currentCar).set(0, newMileage);
                    } else {
                        carsMap.get(currentCar).set(0, newMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", currentCar, currentKilometers);
                    }
                    break;
            }
            if ((carsMap.get(currentCar).get(0)) >= 100000) {
                carsMap.remove(currentCar);
                System.out.printf("Time to sell the %s!%n", currentCar);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : carsMap.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue().get(0);
            int fuel = entry.getValue().get(1);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car, mileage, fuel);

        }
    }
}
