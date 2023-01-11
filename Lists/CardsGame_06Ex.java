package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CardsGame_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        while (firstHand.size()!=0 && secondHand.size()!=0) {
                int firstPlayerCard = firstHand.get(0);
                int secondPlayerCard = secondHand.get(0);
                firstHand.remove(0);
                secondHand.remove(0);

                if (firstPlayerCard > secondPlayerCard) {
                    firstHand.add(firstPlayerCard);
                    firstHand.add(secondPlayerCard);
                } else if (secondPlayerCard > firstPlayerCard) {
                    secondHand.add(secondPlayerCard);
                    secondHand.add(firstPlayerCard);
                }
            }

        int firstSum = 0;
        int secondSum = 0;

        if (firstHand.size() == 0) {
            for (int card:secondHand) {
                secondSum += card;
            }
            System.out.printf("Second player wins! Sum: %d", secondSum);

        } else if (secondHand.size() == 0) {
            for (int card:firstHand) {
                firstSum += card;
            }
            System.out.printf("First player wins! Sum: %d", firstSum);
        }
    }
}
