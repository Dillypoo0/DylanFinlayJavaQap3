package Problem1;

public class Teacher extends Person {

    private String mySubject;
    private double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getter and Setter methods
    public String getSubject() {
        return mySubject;
    }
    
    public void setSubject(String subject) {
        this.mySubject = subject;
    }
    
    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}
