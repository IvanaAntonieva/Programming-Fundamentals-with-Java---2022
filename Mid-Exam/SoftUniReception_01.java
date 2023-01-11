import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int allEmployeePerHour = firstEmployee + secondEmployee + thirdEmployee;

        int hours = 0;
        while (students > 0) {
            hours++;
            if (hours % 4 != 0) {
                students -= allEmployeePerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
