package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double result = mathOperation(firstNumber, operator, secondNumber);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.printf(df.format(result));
    }

    public static double mathOperation(double n1, String operator, double n2) {
        double result = 0.0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        return result;
    }
}
