package Workshop.UniversityMgmtSystem;
public class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String id, String name, int credits) {
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseId + ")";
    }
}
