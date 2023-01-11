import java.util.Scanner;

public class PoundstoDollars_02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float GBP = Float.parseFloat(scanner.nextLine());
        float USD = GBP * 1.36f;

        System.out.printf("%.3f", USD);
    }
}
