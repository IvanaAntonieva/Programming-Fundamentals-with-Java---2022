package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String currentStudentData = scanner.nextLine();
            String currentStudentFirstName = currentStudentData.split(" ")[0];
            String currentStudentLastName = currentStudentData.split(" ")[1];
            double currentStudentGrade = Double.parseDouble(currentStudentData.split(" ")[2]);
            Student student = new Student(currentStudentFirstName, currentStudentLastName, currentStudentGrade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student:studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
