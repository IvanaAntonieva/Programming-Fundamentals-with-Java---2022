package Methods;

import java.util.Scanner;

public class Calculations_04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }
    }
    public static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
    public static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }
    public static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }
    public static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
