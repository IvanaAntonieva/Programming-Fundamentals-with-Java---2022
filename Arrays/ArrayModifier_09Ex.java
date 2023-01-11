package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayModifier_09Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            String firstCommand = commandArr[0];
            switch (firstCommand) {
                case "multiply":
                    int firstIndex = Integer.parseInt(commandArr[1]);
                    int secondIndex = Integer.parseInt(commandArr[2]);
                    int multiplyFirstNum = array[firstIndex];
                    int multiplySecondNum = array[secondIndex];
                    int product = multiplyFirstNum * multiplySecondNum;
                    array[firstIndex] = product;
                    break;
                case "swap":
                    int firstIndexToSwap = Integer.parseInt(commandArr[1]);
                    int secondIndexToSwap = Integer.parseInt(commandArr[2]);
                    int firstNumToSwap = array[firstIndexToSwap];
                    int secondNumToSwap = array[secondIndexToSwap];
                    array[secondIndexToSwap] = firstNumToSwap;
                    array[firstIndexToSwap] = secondNumToSwap;
                    break;
                case "decrease":
                    for (int i = 0; i <= array.length - 1; i++) {
                        array[i] = array[i] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array).replace("[","").replace("]", ""));
        }
    }
