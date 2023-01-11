package opinionpoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String personData = scanner.nextLine();
            String name = personData.split(" ")[0];
            int age = Integer.parseInt(personData.split(" ")[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                personList.add(person);
            }
        }
        for (Person person:personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
