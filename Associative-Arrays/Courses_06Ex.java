import java.util.*;

public class Courses_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputData = input.split(" : ");
            String courseName = inputData[0];
            String personName = inputData[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
                courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }
        courses.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().forEach(studentName ->
                            System.out.println("-- " + studentName));
        });
    }
}
