package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensbyOdds_10Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = Math.abs(n);
        System.out.println(getMultiplyEvensByOdds(number));
    }

    public static int getMultiplyEvensByOdds(int number) {
        return getEvenSum(number) * getOddSum(number);
    }

    public static int getEvenSum(int number) {
        String intToString = Integer.toString(number);
        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        String intToString = Integer.toString(number);
        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }
        return oddSum;
    }


}
