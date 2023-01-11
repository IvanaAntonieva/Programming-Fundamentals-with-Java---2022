import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceMap.containsKey(resource)) {
                resourceMap.put(resource, quantity);
            } else {
                resourceMap.put(resource, resourceMap.get(resource) + quantity);
            }
            resource = scanner.nextLine();
        }
        resourceMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
