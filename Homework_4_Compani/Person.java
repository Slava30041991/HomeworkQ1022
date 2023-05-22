package Homework_4_Compani;

public class Person implements Info {
private String name;
private String secondName;
public  Person(String name, String secondName){
    this.name = name;
    this.secondName =secondName;
}

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
    public void InfoName(){
        System.out.println(" " + this.name + this.secondName );

    }


}
