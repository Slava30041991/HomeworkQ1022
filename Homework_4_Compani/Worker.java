package Homework_4_Compani;

public class Worker extends Employee {
    public Worker(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {
        this.prof = Prof.WORKER;
    }
}
