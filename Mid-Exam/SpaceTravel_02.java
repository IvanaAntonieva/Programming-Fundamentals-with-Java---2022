import java.util.Scanner;

public class SpaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\|\\|");
        int initFuel = Integer.parseInt(scanner.nextLine());
        int initAmmunition = Integer.parseInt(scanner.nextLine());

        int distance = 0;

        for (int i = 0; i < inputArr.length; i++) {
            String[] commandParts = inputArr[i].split("\\s+");

            if (commandParts[0].equals("Travel")) {
                int lightYears = Integer.parseInt(commandParts[1]);
                if (initFuel >= lightYears) {
                    distance += lightYears;
                    initFuel -= lightYears;
                    System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                } else {
                    System.out.println("Mission failed.");
                    break;
                }
            } else if (commandParts[0].equals("Enemy")) {
                int enemyArmour = Integer.parseInt(commandParts[1]);
                if (initAmmunition >= enemyArmour) {
                    initAmmunition -= enemyArmour;
                    System.out.printf("An enemy with %d armour is defeated.%n", enemyArmour);
                } else {
                    int fuelToRun = 2 * enemyArmour;
                    if (initFuel >= fuelToRun) {
                        initFuel -= 2 * enemyArmour;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmour);
                    } else {
                        System.out.println("Mission failed.");
                        break;
                    }
                }
            } else if (commandParts[0].equals("Repair")) {
                int numberToAdd = Integer.parseInt(commandParts[1]);
                initFuel += numberToAdd;
                initAmmunition += numberToAdd * 2;
                int ammunitionAdded = numberToAdd * 2;
                System.out.printf("Ammunitions added: %d.%n", ammunitionAdded);
                System.out.printf("Fuel added: %d.%n", numberToAdd);
            } else if (commandParts[0].equals("Titan")) {
                System.out.println("You have reached Titan, all passengers are safe.");
            }
        }
    }
}
