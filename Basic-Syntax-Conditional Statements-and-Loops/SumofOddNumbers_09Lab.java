import java.util.Scanner;

public class SumofOddNumbers_09Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: " + sum);
    }
}
