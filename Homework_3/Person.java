package Homework_3;

public class Person {
    private String surname;
    private String name;
    private int age;
    private String floor;
    public Person( String surname, String name, int age, String floor ) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.floor = floor;
        System.out.println(surname + " " + name + " " + age + " " + floor + " ");
    }
    public Person(String surname){
        this.surname = surname;
        System.out.println();
    }
    public Person() {
        System.out.println();
    }

    public void equals() {

    }
}
