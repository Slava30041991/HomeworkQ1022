package Homework_6_Features;

public class Child {
    private String name;
    private Integer age;
    boolean isMan;
    public Child(String name, Integer age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public boolean isMan() {
        return isMan;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }
}

