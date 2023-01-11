package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PokemonDontGo_09Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= pokemons.size() - 1) {
                int removedNumber = pokemons.get(index);
                sum += removedNumber;
                pokemons.remove(index);
                changeNumbersMethod(pokemons, removedNumber);
            } else if (index < 0) {
                int removedNumber = pokemons.get(0);
                sum += removedNumber;
                int lastNumber = pokemons.get(pokemons.size() - 1);
                pokemons.set(0, lastNumber);
                changeNumbersMethod(pokemons, removedNumber);
            } else if (index > pokemons.size() - 1) {
                int removedNumber = pokemons.get(pokemons.size() - 1);
                sum += removedNumber;
                int firstNumber = pokemons.get(0);
                pokemons.set(pokemons.size() - 1, firstNumber);
                changeNumbersMethod(pokemons, removedNumber);
            }
        }
            System.out.println(sum);
    }
    public static void changeNumbersMethod (List<Integer> pokemons, int removedNumber) {
        for (int i = 0; i < pokemons.size(); i++) {
            int currentNumber = pokemons.get(i);
            if (currentNumber <= removedNumber) {
                currentNumber += removedNumber;
            } else {
                currentNumber -= removedNumber;
            }
            pokemons.set(i, currentNumber);
        }
    }
}
