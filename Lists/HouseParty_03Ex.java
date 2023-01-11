package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if (input.contains("not")) {
                String nameToRemove = input.get(0);
                if (guestList.contains(nameToRemove)) {
                    guestList.remove(nameToRemove);
                } else {
                    System.out.printf("%s is not in the list!%n", nameToRemove);
                }
            } else {
                String nameToAdd = input.get(0);
                if (guestList.contains(nameToAdd)) {
                    System.out.printf("%s is already in the list!%n", nameToAdd);
                } else {
                    guestList.add(nameToAdd);
                }
            }
        }
        for (String guest : guestList) {
            System.out.println(guest + " ");
        }
    }
}
