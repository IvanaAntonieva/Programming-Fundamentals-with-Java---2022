package Methods;

import java.util.Scanner;

public class FactorialDivision_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        long firstFact = factorial(firstNum);
        long secondFact = factorial(secondNum);
        double factDiv = firstFact * 1.0 / secondFact;
        System.out.printf("%.2f", factDiv);

    }
    public static long factorial(int n) {
        long add = 1;
        for (int i = 1; i <= n; i++) {
            add *= i ;
        }
        return add;
    }
}
