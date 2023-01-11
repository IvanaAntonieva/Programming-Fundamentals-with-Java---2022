import java.util.Scanner;

public class BiscuitFactory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsADay = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int otherFactoryProduction = Integer.parseInt(scanner.nextLine());

        double production = 0.0;
        int days = 1;
        while (days <= 30) {
            double biscuitsThisDay = 0.0;
            for (int day = 1; day <= 30; day++) {
                if (day % 3 != 0) {
                    biscuitsThisDay = 1.0 * biscuitsADay * employees;
                } else {
                    biscuitsThisDay = Math.floor(0.75 * biscuitsADay * employees);
                }
                days++;
                production += biscuitsThisDay;
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", production);

            double diff = Math.abs(production  - otherFactoryProduction);
            double percent = (diff / otherFactoryProduction) * 100;
        if (production > otherFactoryProduction) {
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", percent);
        }
    }
}
