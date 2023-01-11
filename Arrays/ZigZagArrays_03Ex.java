package Arrays;

import java.util.Scanner;

public class ZigZagArrays_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int i = 1; i <= rows ; i++) {
            String[] array = scanner.nextLine().split(" ");

            if (i % 2 != 0) {
                firstArray[i-1] = array[0];
                secondArray[i-1] = array[1];
            } else {
                firstArray[i-1] = array[1];
                secondArray[i-1] = array[0];
            }
        }
//        System.out.println(String.join(" ", firstArray));
//        System.out.println(String.join(" ", secondArray));
        for (String number:
             firstArray) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (String number :
             secondArray) {
            System.out.print(number + " ");
        }
    }
}
