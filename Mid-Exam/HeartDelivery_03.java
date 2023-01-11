import java.util.Scanner;
import java.util.Arrays;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] neighborhood = scanner.nextLine().split("\\@");
        int[] houses = Arrays.stream(neighborhood).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        int index = 0;
        while (!command.equals("Love!")) {
            String[] commandLine = command.split("\\s+");
            int currentIndex = Integer.parseInt(commandLine[1]);
            index += currentIndex;

            if (index >= houses.length) {
                index = 0;
            }
            int currentHouse = houses[index];

            if (currentHouse == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else if (index <= houses.length) {
                for (int i = 0; i < houses.length; i++) {
                    if (i == index) {
                        currentHouse = houses[index] - 2;
                        houses[index] = currentHouse;
                        if (currentHouse == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", index);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int counts = houses.length;
        int fails = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == 0) {
                counts--;
            } else {
                fails++;
            }
        }
        if (counts == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", fails);
        }
    }
}

