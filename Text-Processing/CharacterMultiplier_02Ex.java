import java.util.Scanner;

public class CharacterMultiplier_02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        int sum = 0;
        int minLength = Math.min(firstArr.length, secondArr.length);
        int maxLength = Math.max(firstArr.length, secondArr.length);
        for (int i = 0; i < minLength; i++) {
            sum += firstArr[i] * secondArr[i];
        }
        if (maxLength == firstArr.length) {
            for (int i = minLength; i < maxLength; i++) {
                sum += firstArr[i];
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                sum += secondArr[i];
            }
        }
        System.out.println(sum);
    }
}
