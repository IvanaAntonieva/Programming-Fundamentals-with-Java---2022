package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(inputList);
        System.out.println(inputList.toString().replace("[", "")
                                                .replace("]", "")
                                                .replaceAll(",", "")
                                                .trim()
                                                .replaceAll("\\s+", " "));
    }
}
