import java.util.Scanner;

public class MultiplicationTable2_11Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (m>10) {
        int product = n * m;
            System.out.println(n + " X " + m + " = " + product);
        } else {
            for (int i = m; i <= 10; i++) {
                int product = n * i;
                System.out.println(n + " X " + i + " = " + product);
            }
        }
    }
}
