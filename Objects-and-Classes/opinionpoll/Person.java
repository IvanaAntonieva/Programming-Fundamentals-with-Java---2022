package opinionpoll;

public class Person {
//полета -> характеристики;
    private String name;
    private int age;

//    конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    методи
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
