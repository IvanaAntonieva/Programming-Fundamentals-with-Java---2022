package Methods;

import java.util.Scanner;

public class SignofIntegerNumbers_01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printNum(num);
    }

    public static void printNum (int num) {
        if (num<0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num>0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}

