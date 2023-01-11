import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        char firstSymbol = ' ';
        int secondSymbol = 0;
        int thirdSymbol = 0;
        int forthSymbol = 0;

        for (int i = a1; i <= a2 - 1 ; i++) {
            System.out.println(i);
        }
    }
}
