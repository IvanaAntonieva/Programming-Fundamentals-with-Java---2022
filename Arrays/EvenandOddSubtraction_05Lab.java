package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EvenandOddSubtraction_05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < intArr.length; i++) {
            int num = intArr[i];
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
