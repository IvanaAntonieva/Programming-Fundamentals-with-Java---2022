package Methods;

import java.util.Scanner;

public class NxNMatrix_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            printLine(n);
        }
    }
    public static void printLine (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
