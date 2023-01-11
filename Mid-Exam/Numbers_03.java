import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum * 1.0 / numbers.length;

        List<Integer> newNumbersList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                newNumbersList.add(numbers[i]);
            }
        }
        Collections.sort(newNumbersList);
        Collections.reverse(newNumbersList);

        if (newNumbersList.size() > 5) {
            List<Integer> topFiveNumbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                topFiveNumbers.add(newNumbersList.get(i));
            }
            System.out.println(topFiveNumbers.toString().replaceAll("[\\[\\],]", ""));
        } else if (newNumbersList.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println(newNumbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
