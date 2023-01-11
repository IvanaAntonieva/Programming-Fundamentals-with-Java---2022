package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum += wagons[i];
        }
        Arrays.stream(wagons).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(sum);
    }
}
