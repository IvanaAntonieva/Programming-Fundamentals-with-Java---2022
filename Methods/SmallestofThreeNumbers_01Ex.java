package Methods;

import java.util.Scanner;

public class SmallestofThreeNumbers_01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int result = smallestOfThreeNumbers(a, b, c);
        System.out.println(result);

    }
    public static int smallestOfThreeNumbers (int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <=  n3) {
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
