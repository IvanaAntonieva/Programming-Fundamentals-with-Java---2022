package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceofEqualElements_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lenght = 1;
        int startIndex = 0;
        int maxLenght = 0;
        int bestStart = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                lenght++;
            } else {
                lenght = 1;
                startIndex = i;
            }
        if (lenght > maxLenght) {
            maxLenght = lenght;
            bestStart = startIndex;
        }
        }
        for (int j = bestStart; j < bestStart + maxLenght; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
