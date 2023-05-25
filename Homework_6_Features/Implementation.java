package Homework_6_Features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Implementation {
    public static void main(String[] args) {
        List<Parent> parents = Arrays.asList(
                new Parent("Parent1",55,Arrays.asList(
                        new Child("Child11", 29, true),
                        new Child("Child12", 5, false),
                        new Child("Child13", 10, true),
                        new Child("Child14", 20, false)
                )),
                new Parent("Parent2", 45,Arrays.asList(
                        new Child("Child21",25, true),
                        new Child("Child21",20, true)
                )),
                new Parent("Parent3", 80, Arrays.asList(
                        new Child("Child31",50,true),
                        new Child("Child32",40,true),
                        new Child("Child33",45,false)
                ))
        );
        parents.stream()
//                .filter(parent -> parent.getChildren().size()>40)
                .filter(parent -> parent.getAge() >15)
                .map(parent -> parent.getName())
                .map(String::length)
                .forEach(System.out::println);


        }
}
