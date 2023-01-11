package Methods;

import java.util.Scanner;

public class RepeatString_07Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(printNewString(string, n));
    }



    public static String printNewString(String string, int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += string;
        }
        return result;
    }
}
