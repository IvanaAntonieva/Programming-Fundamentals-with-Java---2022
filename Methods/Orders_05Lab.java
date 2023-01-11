package Methods;

import java.util.Scanner;

public class Orders_05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                totalSum(quantity, 1.50);
                break;
            case "water":
                totalSum(quantity, 1.00);
                break;
            case "coke":
                totalSum(quantity, 1.40);
                break;
            case "snacks":
                totalSum(quantity, 2.00);
                break;
        }
    }
    public static void totalSum(int quantity, double price) {
        double total = quantity * price;
        System.out.printf("%.2f", total);
    }
}


