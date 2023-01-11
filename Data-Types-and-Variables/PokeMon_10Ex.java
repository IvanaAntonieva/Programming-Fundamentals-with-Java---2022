import java.util.Scanner;

public class PokeMon_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int pokes = 0;
        int currentN = n;
        while (currentN >= m) {
            currentN -= m;
            pokes++;
            if (currentN == n * 0.5) {
                if (y > 0) {
                    currentN /= y;
                }
            }
        }
        System.out.println(currentN);
        System.out.println(pokes);
    }
}
