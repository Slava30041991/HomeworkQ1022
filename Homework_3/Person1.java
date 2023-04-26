package Homework_3;

public enum Person1 {

    PERSON1("Петров", "Миша",20, "Мужской "),
    PERSON2("Иванов", "Гоша",40, "Мужской "),
    PERSON3("Пупкина", "Маша",28, "Женский "),
    PERSON4("Хитрикова", "Кристина",35, "Женский ");
    private  String surname;
    private String name;
    private int age;
    private String floor;
    Person1(String surname, String name, int age, String floor) {
        this.surname=surname;
        this.name = name;
        this.age = age;
        this.floor = floor;
    }
    public void println (){
        System.out.println( surname+ " " + name);
    }
    public void addAge(int addAge) {
        age += addAge;
        System.out.println(age);
    }
    public void printUser() {
        System.out.println("Фамилия: "+surname);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: "+ age);
        System.out.println("Пол: " + floor );
    }

}

