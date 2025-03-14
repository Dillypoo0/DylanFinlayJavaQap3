package Problem1;

public class CollegeStudent extends Student {
    private int myYear; // Year (Fresh = 1, Soph = 2 ...)
    private String myMajor; // Major (e.g. Computer Science, Electrical Engineering) 
    
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Calling the constructor of Student
        myYear = year;
        myMajor = major;
    }

    // Getter and Setter methods
    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        this.myMajor = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
