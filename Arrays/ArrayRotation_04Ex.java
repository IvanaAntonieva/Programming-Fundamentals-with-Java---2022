package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations ; i++) {
            int numberToRotate = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = numberToRotate;
        }
        // Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
