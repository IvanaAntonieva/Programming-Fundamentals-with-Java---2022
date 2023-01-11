import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@#+[A-Z](?<password>[A-Za-z0-9]{4,})[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Invalid barcode");
            } else {
                String password = matcher.group("password");
                String productGroup = "";
                for (int j = 0; j < password.length(); j++) {
                    char symbol = password.charAt(j);
                    if (Character.isDigit(symbol)) {
                        productGroup += symbol;
                    }
                }
                if (productGroup == "") {
                    productGroup = "00";
                }
                System.out.printf("Product group: %s%n", productGroup);
            }
        }
    }
}
