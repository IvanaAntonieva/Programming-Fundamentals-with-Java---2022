import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        int maxAttendances = 0;
        double maxBonusPoints = Integer.MIN_VALUE;

        for (int i = 0; i < students; i++) {
            int currentAttendances = Integer.parseInt(scanner.nextLine());
            double currentBonus = currentAttendances * 1.0 / lectures * (5 + initialBonus);
            if (currentBonus > maxBonusPoints) {
                maxBonusPoints = currentBonus;
                maxAttendances = currentAttendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonusPoints));
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
