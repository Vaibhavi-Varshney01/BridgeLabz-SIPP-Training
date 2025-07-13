package Day5_Inheritance.MultilevelInheritance;
class Course {
 String courseName;
 int duration;  

 Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 void displayDetails() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " hours");
 }
}
 
class OnlineCourse extends Course {
 String platform;
 boolean isRecorded;

 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
 }
}
 
class PaidOnlineCourse extends OnlineCourse {
 double fee;
 double discount; 

 PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 double getFinalFee() {
     return fee - (fee * discount / 100);
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Fee: ₹" + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Final Fee After Discount: ₹" + getFinalFee());
 }
}
 
public class EducationalCourse {
 public static void main(String[] args) {
     
     PaidOnlineCourse poc = new PaidOnlineCourse(
         "Full Stack Web Development",
         120,
         "Udemy",
         true,
         9999,
         20
     );

     System.out.println("=== Paid Online Course Details ===");
     poc.displayDetails();
 }
}

