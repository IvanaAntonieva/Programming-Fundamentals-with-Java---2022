import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] inputData = input.split(" ");
            String product = inputData[0];
            double price = Double.parseDouble(inputData[1]);
            int quantity = Integer.parseInt(inputData[2]);

            priceMap.put(product, price);

            if (!quantityMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                quantityMap.put(product, quantityMap.get(product) + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String productName = entry.getKey();
            Double total = entry.getValue() * quantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, total);
        }
    }
}

