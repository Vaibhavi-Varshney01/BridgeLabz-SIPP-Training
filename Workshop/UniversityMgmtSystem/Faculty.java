package Workshop.UniversityMgmtSystem;
public class Faculty implements Graded {
    private String name;
    private String facultyId;

    public Faculty(String name, String id) {
        this.name = name;
        this.facultyId = id;
    }

    @Override
    public void assignGrade(Student s, Course c, double grade) {
        if (!s.coursesEnrolled.contains(c)) {
            System.out.println("⚠ Student not enrolled in " + c.getCourseName());
            return;
        }
        System.out.println("✅ Faculty " + name + " assigned grade " + grade + " for " + s.name + " in " + c.getCourseName());
        s.addGrade(grade);
    }

    @Override
    public String toString() {
        return name + " (" + facultyId + ")";
    }
}
