import java.util.Scanner;

public class Orders_09Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= orders ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int count = Integer.parseInt(scanner.nextLine());
            double priceCoffee = price * days * count;
            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffee);
            total += priceCoffee;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
