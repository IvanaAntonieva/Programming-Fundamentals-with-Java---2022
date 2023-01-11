import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!input.isEmpty()) {
            Random rnd = new Random();
            int rndIndex = rnd.nextInt(input.size());
            String word = input.get(rndIndex);
            System.out.println(word);
            input.remove(rndIndex);
        }
    }
}
