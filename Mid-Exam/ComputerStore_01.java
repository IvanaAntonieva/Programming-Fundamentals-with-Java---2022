import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumWithoutTaxes = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                sumWithoutTaxes += price;
            }
            input = scanner.nextLine();
        }
        double taxes = 0.20 * sumWithoutTaxes;
        double finalSum = sumWithoutTaxes + taxes;
        if (input.equals("special")) {
            finalSum = 0.90 * finalSum;
        }
        if (finalSum <= 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", finalSum);
        }
    }
}
