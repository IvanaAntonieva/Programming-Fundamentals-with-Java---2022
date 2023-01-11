import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
        String input = scanner.nextLine();
        String hero = input.split(" ")[0];
        int hitPoints = Integer.parseInt(input.split(" ")[1]);
        int manaPoints = Integer.parseInt(input.split(" ")[2]);
        heroesMap.putIfAbsent(hero, new ArrayList<>());
        heroesMap.get(hero).add(0, hitPoints);
        heroesMap.get(hero).add(1, manaPoints);
        }
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("End")) {
            String command = commandLine.split(" - ")[0];
            String currentHero = commandLine.split(" - ")[1];
            int amount = 0;
            switch (command) {

                case "CastSpell":
                    int manaPointsNeeded = Integer.parseInt(commandLine.split(" - ")[2]);
                    String spellName = commandLine.split(" - ")[3];
                    if (manaPointsNeeded <= heroesMap.get(currentHero).get(1)) {
                        int newManaPoints = heroesMap.get(currentHero).get(1) - manaPointsNeeded;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", currentHero, spellName, newManaPoints);
                        heroesMap.get(currentHero).set(1, newManaPoints);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", currentHero, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(commandLine.split(" - ")[2]);
                    String attacker = commandLine.split(" - ")[3];
                    int newHitPoints = heroesMap.get(currentHero).get(0) - damage;
                    heroesMap.get(currentHero).set(0, newHitPoints);
                    if (newHitPoints > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", currentHero, damage, attacker, newHitPoints);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", currentHero, attacker);
                        heroesMap.remove(currentHero);
                    }
                    break;

                case "Recharge":
                    amount = Integer.parseInt(commandLine.split(" - ")[2]);
                    int rechargedManaPoints = heroesMap.get(currentHero).get(1) + amount;
                    int newManaPoints = rechargedManaPoints;
                    int diff = 0;
                    if (rechargedManaPoints > 200) {
                        newManaPoints = 200;
                        diff = 200 - heroesMap.get(currentHero).get(1);
                    } else {
                        diff = amount;
                    }
                    heroesMap.get(currentHero).set(1, newManaPoints);
                    System.out.printf("%s recharged for %d MP!%n", currentHero, diff);
                    break;

                case "Heal":
                    amount = Integer.parseInt(commandLine.split(" - ")[2]);
                    int healedHitPoints = heroesMap.get(currentHero).get(0) + amount;
                    int newHP = healedHitPoints;
                    int healedAmount = 0;
                    if (healedHitPoints > 100) {
                        newHP = 100;
                        healedAmount = 100 - heroesMap.get(currentHero).get(0);
                    } else {
                        healedAmount = amount;
                    }
                    heroesMap.get(currentHero).set(0, newHP);
                    System.out.printf("%s healed for %d HP!%n", currentHero, healedAmount);
                    break;
            }
            commandLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            String hero = entry.getKey();
            int HP = entry.getValue().get(0);
            int MP = entry.getValue().get(1);
            System.out.println(hero);
            System.out.println("  HP: " + HP);
            System.out.println("  MP: " + MP);
        }
    }
}
