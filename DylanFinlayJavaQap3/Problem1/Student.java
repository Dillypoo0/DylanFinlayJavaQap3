package Problem1;

public class Student extends Person {

    private String myIdNum; // Student Id Number
    private double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Calling the constructor of Person
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter and Setter methods
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}
