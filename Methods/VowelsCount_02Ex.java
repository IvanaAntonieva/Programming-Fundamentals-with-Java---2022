package Methods;

import java.util.Scanner;

public class VowelsCount_02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        int count = vowelsCount(string);
        System.out.println(count);
    }
    public static int vowelsCount (String string) {
        int count = 0;
        for (char symbol:string.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol=='i' || symbol=='o' || symbol=='u') {
                count++;
            }
        }
        return count;
    }
}
