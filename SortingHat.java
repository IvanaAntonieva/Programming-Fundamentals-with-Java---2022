import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Welcome!")) {
            if (input.equals("Voldemort")) {
                System.out.println("You must not speak of that name!");
                break;
            }
            if (input.length()<5) {
                System.out.println(input + " goes to Gryffindor.");
            }
            else if (input.length()==5) {
                System.out.println(input + " goes to Slytherin.");
            }
            else if (input.length()==6) {
                System.out.println(input + " goes to Ravenclaw.");
            }
            else if (input.length()>6) {
                System.out.println(input + " goes to Hufflepuff.");
            }
            input = scanner.nextLine();
        }
        if (input.equals("Welcome!")) {
            System.out.println("Welcome to Hogwarts.");
        }
    }
}
