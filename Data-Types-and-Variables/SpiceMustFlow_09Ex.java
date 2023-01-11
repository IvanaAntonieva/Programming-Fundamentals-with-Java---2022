import java.util.Scanner;

public class SpiceMustFlow_09Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalYield = 0;
        while (yield >= 100) {
            int currentYield = yield - 26;
            days++;
            totalYield += currentYield;
            yield = yield - 10;
            }
        System.out.println(days);
        if (totalYield >= 26) {
            totalYield -= 26;
        }
        System.out.println(totalYield);
    }
}
