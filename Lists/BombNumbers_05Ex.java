package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BombNumbers_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> specialNumbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int specialNumber = specialNumbers.get(0);
        int powerNumber = specialNumbers.get(1);
        int sum = 0;

        while (numbers.contains(specialNumber)) {
            int index = numbers.indexOf(specialNumber);
            int left = Math.max(0, index - powerNumber);
            int right = Math.min(index + powerNumber, numbers.size() - 1);
            for (int i = right; i >= left ; i--) {
                numbers.remove(i);
            }
        }
        for (int num:numbers) {
            sum += num;
        }
            System.out.print(sum);
    }
}
