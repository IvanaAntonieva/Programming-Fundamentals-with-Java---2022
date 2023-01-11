package Methods;

import java.util.Scanner;

public class AddandSubtract_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fistNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int sum = add(fistNum, secondNum);
        int sub = subtract(sum, thirdNum);
        System.out.println(sub);

    }
    public static int add (int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subtract (int a, int b) {
        int result = a - b;
        return result;
    }
}
