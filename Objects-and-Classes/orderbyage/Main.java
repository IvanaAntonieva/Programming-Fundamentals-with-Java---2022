package orderbyage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String personName = input.split(" ")[0];
            String personID = input.split(" ")[1];
            int personAge = Integer.parseInt(input.split(" ")[2]);
            Person person = new Person(personName, personID, personAge);
            personList.add(person);
            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparingInt(Person::getAge));
        for (Person person:personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
