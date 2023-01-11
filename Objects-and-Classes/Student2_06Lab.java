import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student2_06Lab {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return this.age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputStudent = input.split(" ");

            String firstName = inputStudent[0];
            String lastName = inputStudent[1];
            String age = inputStudent[2];
            String hometown = inputStudent[3];

            Student currentStudent = new Student(firstName, lastName, age, hometown);

            int existingStudentIndex = findExistingStudent(studentList, currentStudent.getFirstName(), currentStudent.getLastName());
            if (existingStudentIndex!=-1) {
                studentList.get(existingStudentIndex).setAge(currentStudent.getAge());
                studentList.get(existingStudentIndex).setHometown(currentStudent.getHometown());
            } else {
                studentList.add(currentStudent);
            }

            input = scanner.nextLine();

        }
        String searchTown = scanner.nextLine();

        for (Student item:studentList) {
            if (item.getHometown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }

    static public int findExistingStudent(List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
