package Methods;

import java.util.Scanner;

public class GreaterofTwoValues_09Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

private static int getMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
}

private static char getMax(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        } else {
            return ch2;
        }
}

private static String getMax(String s1, String s2) {
        String result = "";
        if (s1.compareTo(s2) > 0) {
            result = s1;
        } else {
            result = s2;
        }
        return result;
}
}

