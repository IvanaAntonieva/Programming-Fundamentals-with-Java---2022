package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EqualSums_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isEqual = false;
        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j <= i - 1; j++) {
                leftSum += array[j];
            }
            for (int k = i + 1; k < array.length; k++) {
                rightSum += array[k];
            }
            if (leftSum == rightSum) {
                isEqual = true;
                System.out.println(i);
                break;
            }
        }
            if (!isEqual)
                System.out.println("no");
    }
}

