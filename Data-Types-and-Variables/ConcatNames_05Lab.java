import java.util.Scanner;

public class ConcatNames_05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstName+delimiter+secondName);
    }
}
