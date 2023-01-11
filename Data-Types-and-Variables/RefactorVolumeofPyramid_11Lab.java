import java.util.Scanner;

public class RefactorVolumeofPyramid_11Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double volume = (lenght * height * width) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);
    }
}
