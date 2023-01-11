import java.util.Scanner;

public class MovieTickets {
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
                firstSymbol = (char)i;
                forthSymbol = i;
            for (int j = 1; j <= n - 1 ; j++) {
                secondSymbol = j;
                for (int k = 1; k <= n / 2 - 1 ; k++) {
                    thirdSymbol = k;
                    if (forthSymbol % 2 == 1 && (secondSymbol + thirdSymbol + forthSymbol) % 2 == 1) {
                        System.out.println(firstSymbol+ "-" +secondSymbol+thirdSymbol+forthSymbol);
                    }
                }
            }
        }
    }
}
