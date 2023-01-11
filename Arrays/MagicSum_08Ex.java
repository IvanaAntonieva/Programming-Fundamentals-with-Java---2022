package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MagicSum_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == magicSum) {
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        }
    }
}
