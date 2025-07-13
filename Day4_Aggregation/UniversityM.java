package Day4_Aggregation;
import java.util.ArrayList;

 
class Student {
 String name;
 ArrayList<Course> enrolledCourses;

 Student(String name) {
     this.name = name;
     enrolledCourses = new ArrayList<>();
 }

 
 void enrollCourse(Course course) {
     enrolledCourses.add(course);
     course.addStudent(this);  // bidirectional link
     System.out.println(name + " enrolled in " + course.courseName);
 }

 void showCourses() {
     System.out.println("\nCourses of student " + name + ":");
     for (Course c : enrolledCourses) {
         System.out.println("- " + c.courseName);
     }
 }
}
 
class Professor {
 String name;
 ArrayList<Course> teachingCourses;

 Professor(String name) {
     this.name = name;
     teachingCourses = new ArrayList<>();
 }

  
 void assignCourse(Course course) {
     teachingCourses.add(course);
     course.assignProfessor(this);  
     System.out.println("Prof. " + name + " assigned to course " + course.courseName);
 }

 void showCourses() {
     System.out.println("\nCourses taught by Prof. " + name + ":");
     for (Course c : teachingCourses) {
         System.out.println("- " + c.courseName);
     }
 }
}

 
class Course {
 String courseName;
 Professor professor;
 ArrayList<Student> students;

 Course(String courseName) {
     this.courseName = courseName;
     students = new ArrayList<>();
 }

 void addStudent(Student s) {
     students.add(s);
 }

 void assignProfessor(Professor p) {
     this.professor = p;
 }

 void showDetails() {
     System.out.println("\nCourse: " + courseName);
     if (professor != null)
         System.out.println("Professor: " + professor.name);
     else
         System.out.println("No professor assigned yet.");
     System.out.println("Enrolled Students:");
     for (Student s : students) {
         System.out.println("- " + s.name);
     }
 }
}

 
public class UniversityM {
 public static void main(String[] args) {
 
     Student s1 = new Student("Vaibhavi");
     Student s2 = new Student("Rohan");
 
     Professor p1 = new Professor("Dr. Mehta");
     Professor p2 = new Professor("Dr. Sharma");
 
     Course c1 = new Course("Data Structures");
     Course c2 = new Course("Operating Systems");
 
     p1.assignCourse(c1);
     p2.assignCourse(c2);

     
     s1.enrollCourse(c1);
     s1.enrollCourse(c2);
     s2.enrollCourse(c1);

    
     s1.showCourses();
     s2.showCourses();

     p1.showCourses();
     p2.showCourses();

     c1.showDetails();
     c2.showDetails();
 }
}
