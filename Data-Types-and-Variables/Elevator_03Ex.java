import java.util.Scanner;

public class Elevator_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil(allPeople * 1.0 / capacity * 1.0);
        System.out.println(courses);
    }
}
