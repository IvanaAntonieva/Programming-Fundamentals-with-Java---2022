import java.util.*;

public class StudentAcademy_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> averGradeStudents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(student)) {
                students.put(student, new ArrayList<>());
            }
                students.get(student).add(grade);
            }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            String student = entry.getKey();
            List<Double> grades = entry.getValue();
            double sumGrades = 0;
            for (double grade : grades) {
                sumGrades += grade;
                double averGrade = sumGrades / grades.size();
                if (averGrade >= 4.5) {
                    averGradeStudents.put(student, averGrade);
                }
            }
        }
        averGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
