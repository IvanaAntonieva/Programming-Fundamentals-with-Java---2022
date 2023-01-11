package Arrays;

import java.util.Scanner;

public class TreasureHunt_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyContains = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])) {
                                alreadyContains = true;
                            }
                        }
                        if (!alreadyContains) {
                            String newChest = commandParts[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int k = Integer.parseInt(commandParts[1]);

                    if (k < treasureChest.length -1 && k >= 0) {
                        String itemToDrop = treasureChest[k];
                        for (int l = k; l < treasureChest.length - 1; l++) {
                            treasureChest[l] = treasureChest[l + 1];
                        }
                            treasureChest[treasureChest.length - 1] = itemToDrop;
                        } else {
                        break;
                    }
                    break;
                case "Steal":
                    int m = Integer.parseInt(commandParts[1]);
                    if (m >= 0 && m < treasureChest.length) {
                        for (int o = 0; o < m; o++) {
                            System.out.print(treasureChest[treasureChest.length - m + o]);
                            if (o != m - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length-m];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;
                    } else if (m >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                       treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = ( 1.0 * charCounter ) / treasureChest.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
