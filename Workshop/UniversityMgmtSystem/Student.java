package Workshop.UniversityMgmtSystem;
import java.util.ArrayList;

public class Student {
    protected String name;
    protected String studentId;
    private double gpa; // Encapsulated GPA
    protected ArrayList<Course> coursesEnrolled;
    private ArrayList<Double> grades;
 
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.coursesEnrolled = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Constructor with elective preferences
    public Student(String name, String studentId, ArrayList<Course> electives) {
        this.name = name;
        this.studentId = studentId;
        this.coursesEnrolled = new ArrayList<>(electives);
        this.grades = new ArrayList<>();
    }

    public void enroll(Course c) {
        coursesEnrolled.add(c);
        System.out.println(name + " enrolled in " + c.getCourseName());
    }

    // Protected → Only Faculty can assign grades
    protected void addGrade(double grade) {
        grades.add(grade);
        calculateGPA();
    }

    // GPA calculation (Encapsulation)
    private void calculateGPA() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        this.gpa = (grades.size() > 0) ? (sum / grades.size()) : 0.0;
    }

    public double getGPA() {
        return gpa;
    }

    public void viewTranscript() {
        System.out.println("\nTranscript of " + name + " (" + studentId + ")");
        for (int i = 0; i < coursesEnrolled.size(); i++) {
            String grade = (i < grades.size()) ? String.valueOf(grades.get(i)) : "Pending";
            System.out.println(" - " + coursesEnrolled.get(i).getCourseName() + " → Grade: " + grade);
        }
        System.out.println("Current GPA: " + gpa);
    }

    @Override
    public String toString() {
        return name + " (" + studentId + ")";
    }
}
