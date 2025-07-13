package Day4_Aggregation;
import java.util.*;
 
class Course {
 String courseName;
 ArrayList<Student> enrolledStudents;

 Course(String courseName) {
     this.courseName = courseName;
     this.enrolledStudents = new ArrayList<>();
 }

 void enrollStudent(Student s) {
     enrolledStudents.add(s);
 }

 void showStudents() {
     System.out.println("Students enrolled in: " + courseName);
     for (Student s : enrolledStudents) {
         System.out.println("- " + s.name);
     }
 }
}
 
class Student {
 String name;
 ArrayList<Course> courses;

 Student(String name) {
     this.name = name;
     this.courses = new ArrayList<>();
 }

 void enrollInCourse(Course c) {
     courses.add(c);
     c.enrollStudent(this);  
 }

 void showCourses() {
     System.out.println(name + " is enrolled in:");
     for (Course c : courses) {
         System.out.println("- " + c.courseName);
     }
 }
}

class School {
 String schoolName;
 ArrayList<Student> students;

 School(String schoolName) {
     this.schoolName = schoolName;
     students = new ArrayList<>();
 }

 void addStudent(Student s) {
     students.add(s);
 }

 void showAllStudents() {
     System.out.println("\nStudents in " + schoolName + ":");
     for (Student s : students) {
         System.out.println("- " + s.name);
     }
 }
}

 
public class Students {
 public static void main(String[] args) {
    
     Course math = new Course("Mathematics");
     Course science = new Course("Science");
     Course art = new Course("Art");

     
     Student s1 = new Student("Vaibhavi");
     Student s2 = new Student("Rohan");
 
     School gla = new School("GLA University");
     gla.addStudent(s1);
     gla.addStudent(s2);
 
     s1.enrollInCourse(math);
     s1.enrollInCourse(science);

     s2.enrollInCourse(math);
     s2.enrollInCourse(art);
 
     gla.showAllStudents();

     s1.showCourses();
     s2.showCourses();
 
     math.showStudents();
     science.showStudents();
     art.showStudents();
 }
}
