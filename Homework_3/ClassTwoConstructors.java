package Homework_3;
public class ClassTwoConstructors {
    public void main(String[] args) {
        Man man1 = new Man ("", 5);
        man1.displayInfo();

    }
    class  Man {
        private String name;
        private int age;
        void displayInfo(){
            System.out.println("GHb");
        }
        public Man(String name, int age) {
            System.out.println(age);
            this.name = name;
            this.age = age;

        }
    }}

