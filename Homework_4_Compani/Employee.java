package Homework_4_Compani;

public abstract class Employee extends Person {

    private  int exp;
    protected Prof prof;
    private final int basic = 2000;

    public Employee(String name, String secondName, int exp) {
        super(name, secondName);
        this.exp = exp;
        setProf();
    }

    public Employee() {
        super();
    }

    public int getSalary(){
        return basic * prof.getCoef() * exp;
    }
    public abstract void setProf();
    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", prof=" + prof +
                ", basic=" + basic +
                '}';
    }
}

