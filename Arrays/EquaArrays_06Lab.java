package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EquaArrays_06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean areNotIdentical = false;
        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                areNotIdentical = true;
                break;
            }
        }
        if (!areNotIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
