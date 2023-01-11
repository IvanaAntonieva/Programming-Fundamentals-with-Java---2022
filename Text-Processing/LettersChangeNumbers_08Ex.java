import java.util.Scanner;

public class LettersChangeNumbers_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double total = 0;
        for (String string : input) {
            char firstLetter = string.charAt(0);
            char secondLetter = string.charAt(string.length()-1);
            double number = Double.parseDouble(string.replace(firstLetter, ' ')
                                                        .replace(secondLetter, ' ')
                                                         .trim());
            if (Character.isUpperCase(firstLetter)) {
                number = number / ((int) firstLetter - 64);
            } else {
                number = number * ((int) firstLetter - 96);
            }
            if (Character.isUpperCase(secondLetter)) {
                number = number - ((int) secondLetter - 64);
            } else {
                number = number + ((int) secondLetter - 96);
            }
            total += number;
        }
        System.out.printf("%.2f", total);
    }
}
