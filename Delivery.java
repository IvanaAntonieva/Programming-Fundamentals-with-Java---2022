import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String delivery = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 1.00;

        if (delivery.equals("standart")) {
            if (weight > 0 && weight < 1) {
                price = 0.03;
            } else if (weight >= 1 && weight < 10) {
                price = 0.05;
            } else if (weight >= 10 && weight < 40) {
                price = 0.10;
            } else if (weight >= 40 && weight < 90) {
                price = 0.15;
            } else if (weight >= 90 && weight < 150) {
                price = 0.20;
            }

        } else if (delivery.equals("express")) {
            if (weight > 0 && weight < 1) {
                price = 0.03 + 0.80 * 0.03 * weight;
            } else if (weight >= 1 && weight < 10) {
                price = 0.05 + 0.40 * 0.05 * weight;
            } else if (weight >= 10 && weight < 40) {
                price = 0.10 + 0.05 * 0.10 * weight;
            } else if (weight >= 40 && weight < 90) {
                price = 0.15 + 0.02 * 0.15 * weight;
            } else if (weight >= 90 && weight < 150) {
                price = 0.20 + 0.01 * 0.20 * weight;
            }
        }
        double totalPrice = distance * price;
        System.out.println(totalPrice);
    }
}
