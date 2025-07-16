package DSA.LinkedList;
import java.util.Scanner;

 
class StudentNode {
 int rollNo;
 String name;
 int age;
 String grade;
 StudentNode next;

 public StudentNode(int rollNo, String name, int age, String grade) {
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null;
 }
}

 
class StudentLinkedList {
 private StudentNode head;

 
 public void addAtBeginning(int rollNo, String name, int age, String grade) {
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     newNode.next = head;
     head = newNode;
     System.out.println("✅ Student added at beginning.");
 }

 
 public void addAtEnd(int rollNo, String name, int age, String grade) {
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     if (head == null) {
         head = newNode;
         System.out.println("✅ Student added at end.");
         return;
     }
     StudentNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
     System.out.println("✅ Student added at end.");
 }

 public void addAtPosition(int pos, int rollNo, String name, int age, String grade) {
     if (pos <= 1 || head == null) {
         addAtBeginning(rollNo, name, age, grade);
         return;
     }

     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     StudentNode temp = head;
     int count = 1;

     while (temp != null && count < pos - 1) {
         temp = temp.next;
         count++;
     }

     if (temp == null) {
         addAtEnd(rollNo, name, age, grade);
     } else {
         newNode.next = temp.next;
         temp.next = newNode;
         System.out.println("✅ Student added at position " + pos);
     }
 }

 
 public void deleteByRollNo(int rollNo) {
     if (head == null) {
         System.out.println("❌ List is empty.");
         return;
     }
     if (head.rollNo == rollNo) {
         head = head.next;
         System.out.println("✅ Student with RollNo " + rollNo + " deleted.");
         return;
     }

     StudentNode temp = head;
     while (temp.next != null && temp.next.rollNo != rollNo) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("❌ Student not found.");
     } else {
         temp.next = temp.next.next;
         System.out.println("✅ Student with RollNo " + rollNo + " deleted.");
     }
 }
 
 public void searchByRollNo(int rollNo) {
     StudentNode temp = head;
     while (temp != null) {
         if (temp.rollNo == rollNo) {
             System.out.println("✅ Found Student: RollNo: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("❌ Student not found.");
 }
 
 public void updateGrade(int rollNo, String newGrade) {
     StudentNode temp = head;
     while (temp != null) {
         if (temp.rollNo == rollNo) {
             temp.grade = newGrade;
             System.out.println("✅ Grade updated for RollNo " + rollNo);
             return;
         }
         temp = temp.next;
     }
     System.out.println("❌ Student not found.");
 }
 
 public void displayAll() {
     if (head == null) {
         System.out.println("❌ No student records available.");
         return;
     }
     StudentNode temp = head;
     System.out.println("\n📜 Student Records:");
     while (temp != null) {
         System.out.println("RollNo: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
         temp = temp.next;
     }
 }
}

//✅ Main class with menu
public class StudentRecordMgmt {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     StudentLinkedList list = new StudentLinkedList();

     while (true) {
         System.out.println("\n=== Student Record Management ===");
         System.out.println("1. Add Student at Beginning");
         System.out.println("2. Add Student at End");
         System.out.println("3. Add Student at Specific Position");
         System.out.println("4. Delete Student by Roll Number");
         System.out.println("5. Search Student by Roll Number");
         System.out.println("6. Update Student Grade");
         System.out.println("7. Display All Students");
         System.out.println("8. Exit");
         System.out.print("Enter choice: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter RollNo: ");
                 int r1 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Name: ");
                 String n1 = sc.nextLine();
                 System.out.print("Enter Age: ");
                 int a1 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Grade: ");
                 String g1 = sc.nextLine();
                 list.addAtBeginning(r1, n1, a1, g1);
                 break;

             case 2:
                 System.out.print("Enter RollNo: ");
                 int r2 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Name: ");
                 String n2 = sc.nextLine();
                 System.out.print("Enter Age: ");
                 int a2 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Grade: ");
                 String g2 = sc.nextLine();
                 list.addAtEnd(r2, n2, a2, g2);
                 break;

             case 3:
                 System.out.print("Enter Position: ");
                 int pos = sc.nextInt();
                 System.out.print("Enter RollNo: ");
                 int r3 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Name: ");
                 String n3 = sc.nextLine();
                 System.out.print("Enter Age: ");
                 int a3 = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Grade: ");
                 String g3 = sc.nextLine();
                 list.addAtPosition(pos, r3, n3, a3, g3);
                 break;

             case 4:
                 System.out.print("Enter RollNo to Delete: ");
                 int delRoll = sc.nextInt();
                 list.deleteByRollNo(delRoll);
                 break;

             case 5:
                 System.out.print("Enter RollNo to Search: ");
                 int searchRoll = sc.nextInt();
                 list.searchByRollNo(searchRoll);
                 break;

             case 6:
                 System.out.print("Enter RollNo to Update Grade: ");
                 int updateRoll = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter New Grade: ");
                 String newGrade = sc.nextLine();
                 list.updateGrade(updateRoll, newGrade);
                 break;

             case 7:
                 list.displayAll();
                 break;

             case 8:
                 System.out.println("👋 Exiting...");
                 sc.close();
                 return;

             default:
                 System.out.println("❌ Invalid choice! Try again.");
         }
     }
 }
}
