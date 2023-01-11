import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();

        int shots = 0;
        while (!input.equals("End")) {
           int index = Integer.parseInt(input);
               if (index >= 0 && index < targets.size() && targets.get(index) !=-1) {
               int currentTarget = targets.get(index);
               targets.set(index, -1);
               shots++;
               newTargets(targets, currentTarget);
           }
           input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shots);
        System.out.println(targets.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void newTargets(List<Integer> targets, int currentTarget) {
        for (int i = 0; i < targets.size(); i++) {
                int newTarget = targets.get(i);
            if (newTarget > currentTarget && newTarget != -1) {
                newTarget -= currentTarget;
            } else if (newTarget <= currentTarget && newTarget != -1){
                newTarget += currentTarget;
            }
            targets.set(i, newTarget);
        }
    }

}
