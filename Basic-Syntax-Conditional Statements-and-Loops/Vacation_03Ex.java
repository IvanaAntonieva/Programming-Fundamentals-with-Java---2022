import java.util.Scanner;

public class Vacation_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double total = 0;
        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            } total = price * number;
        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            } total = price * number;
        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            } total = price * number;
        }

        if (groupType.equals("Students") && number >= 30) {
            total = 0.85 * total;
        } else if (groupType.equals("Business") && number >= 100) {
            total = total - (number / 10) * price;
        } else if (groupType.equals("Regular") && number >= 10 && number <= 20) {
            total = 0.95*total;
        }
        System.out.printf("Total price: %.2f", total);
    }
}
