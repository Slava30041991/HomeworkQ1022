package Homework_6_Features;

import java.util.ArrayList;
import java.util.List;
public class Parent {
    private String name;
    public  Integer age;
    private List <Child> children =  new ArrayList();
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public List<Child> getChildren() {
        return children;
    }
    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", children=" + children +
                '}';
    }
    public Parent(String name, Integer age, List<Child> children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }
}
