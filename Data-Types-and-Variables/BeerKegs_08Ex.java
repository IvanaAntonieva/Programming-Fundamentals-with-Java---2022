import java.util.Scanner;

public class BeerKegs_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int keg = 0; keg < n; keg++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = modelKeg;
            }
        }
        System.out.println(maxModel);
    }
}
