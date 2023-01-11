import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int totalBitcoins = 0;

        String[] dungeonsRooms = scanner.nextLine().split("\\|");

        boolean isDead = false;

        for (int i = 0; i < dungeonsRooms.length; i++) {
            String[] room = dungeonsRooms[i].split(" ");
            String command = room[0];
            int number = Integer.parseInt(room[1]);

            switch (command) {
                case "potion":
                    int diffHealth = 100 - health;
                    int bonusHealth = number;
                    health += bonusHealth;
                    if (health > 100) {
                        health = 100;
                        bonusHealth = diffHealth;
                    }
                    System.out.printf("You healed for %d hp.%n", bonusHealth);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    int bitcoins = number;
                    totalBitcoins += bitcoins;
                    System.out.printf("You found %d bitcoins.%n", bitcoins);
                    break;
                default:
                    String monster = command;
                    int monsterAttack = number;
                    health -= monsterAttack;
                    int bestRoom = i + 1;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else if (health <= 0) {
                        isDead = true;
                        System.out.printf("You died! Killed by %s.%n", monster);
                        System.out.printf("Best room: %d%n", bestRoom);
                    }
                    break;
            }
            if (isDead) {
                break;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", totalBitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
