import java.util.Scanner;

public class RageExpenses_11Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double crashedHeadsets = Math.floor(lostGamesCount / 2.0);
        double crashedMouses = Math.floor(lostGamesCount / 3.0);
        double crashedKeyboards = Math.floor(lostGamesCount / 6.0);
        double crashedDisplays = Math.floor(lostGamesCount / 12.0);

        double total = crashedHeadsets * headsetPrice + crashedMouses * mousePrice + crashedKeyboards * keyboardPrice +
                displayPrice * crashedDisplays;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
