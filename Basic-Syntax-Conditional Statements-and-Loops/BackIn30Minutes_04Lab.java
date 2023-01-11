import java.util.Scanner;

public class BackIn30Minutes_04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = (hours * 60) + minutes + 30;
        int hh = allMinutes / 60;
        int mm = allMinutes % 60;

        if (hh > 23) {
            hh = 0;
        }
        System.out.printf("%d:%02d", hh, mm);
    }
}
