import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = scanner.nextBigInteger();
        int secondNumber = scanner.nextInt();
        BigInteger product = firstNumber.multiply(BigInteger.valueOf(secondNumber));
        System.out.println(product);
//        String firstNum = scanner.nextLine();
//        int secondNum = Integer.parseInt(scanner.nextLine());
//        StringBuilder sb = new StringBuilder();
//        int remain = 0;
//
//        for (int i = firstNum.length() - 1; i >= 0; i--) {
//            int digit = Integer.parseInt(firstNum.substring(i, i+1));
//            int current = digit * secondNum + remain;
//            sb.append(current % 10);
//            remain = current / 10;
//        }
//        if (remain != 0) {
//            sb.append(remain);
//        }
//        boolean zero = true;
//        for (int i = 0; i < sb.length(); i++) {
//            if (Integer.parseInt(sb.substring(i, i+1)) != 0) {
//                zero = false;
//            }
//        }
//        if (zero) {
//            System.out.println(0);
//        } else {
//            StringBuilder output = new StringBuilder();
//            boolean trailing = true;
//            for (int i = sb.length() - 1; i >= 0 ; i--) {
//                if (Integer.parseInt(sb.substring(i, i+1)) == 0 && trailing) {
//
//                } else {
//                    trailing = false;
//                    output.append(sb.charAt(i));
//                }
//            }
//            System.out.println(output.toString());
//        }
    }
}
