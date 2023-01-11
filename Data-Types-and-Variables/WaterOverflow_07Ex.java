import java.util.Scanner;

public class WaterOverflow_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        short capacity = 255;
        short liters = 0;

        for (short i = 0; i < n; i++) {
            short currentLiters = Short.parseShort(scanner.nextLine());
            liters += currentLiters;
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
                liters -= currentLiters;
            }
        }
        System.out.println(liters);
    }
}
